package LinkedList;

import java.util.HashSet;
import java.util.ArrayList;

public class findDisappearedNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6,7,7};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int v:nums){
            set.add(v);
        }

        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        // int[] arr = new int[list.size()];
        // for(int i=0; i< arr.length; i++){
        //     arr[i] = list.get(i);
        // }
        System.out.println(list);
    }
}
