package StackAndQueue;

import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

//        Queue<Integer> numbers = new LinkedList<>();
//
//        for(int j = 0; j<nums1.length; j++){
//
//            for(int i=0; i<nums2.length; i++){
//                numbers.add(nums2[i]);
//            }
//
//            while(numbers.poll()!=nums1[j]);
//
//            for(int k=0; ;k++){
//                if(numbers.peek()==null){
//                    nums1[j] = -1;
//                    numbers.clear();
//                    break;
//                }
//                else if (numbers.peek()>nums1[j]){
//                    nums1[j] = numbers.peek();
//                    numbers.clear();
//                    break;
//                }
//                numbers.poll();
//            }
//
//        }

        // same problem solution using stack And map

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num:nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int i=0; i<nums1.length; i++){
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        System.out.println(Arrays.toString(nums1));
    }
}
