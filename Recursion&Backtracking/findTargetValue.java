package demo.recursionPractice;

import java.util.ArrayList;

public class findTargetValue {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,4,5,6};
        int target = 4;

//        System.out.println(findTarget(arr, 0, target));
//        int valueIndex = findIndex(arr, 0, target);
//        if(valueIndex==-1) System.out.println("This value does't exists.");
//        else if(valueIndex!=-1) System.out.println("Index of the value is: "+valueIndex);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, 4, 0));
    }

    static boolean findTarget(int[] arr, int index, int target){
        if(index == arr.length) return false;
        return (arr[index] == target) || findTarget(arr, index+1, target);
    }
    static int findIndex(int[] arr, int index, int target){
        if(index == arr.length) return -1;
        if(arr[index]==target) return index;
        else{
            return findIndex(arr, index+1, target);
        }
    }
    //list declared outside
    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        return findAllIndex(arr, target, index+1, list);
    }
    //list declared inside recursive methode
    static ArrayList findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list1 = new ArrayList<>();
        if(index==arr.length) return list1;
        //this will contain answer for that function call only
        if(arr[index]==target) list1.add(index);
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index+1);
        list1.addAll(ansFromBelowCalls);
        return list1;
    }
}
