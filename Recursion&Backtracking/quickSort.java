package demo.recursionPractice;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,9,6,8,7,1,2,3,4,7};
        quickSort2(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //way 1 of doing quicksort by Varsity lab
    static void quickSort1(int[] arr, int s, int e){
        if(s<e){
            int x = partition1(arr, s, e);
            quickSort1(arr, s, x-1);
            quickSort1(arr, x+1, e);
        }
    }
    static int partition1(int[] arr, int s, int e){
        int i = s-1;
        int pivot = arr[e];
        for(int j=s; j<e; j++){
           if(arr[j]<pivot){
               i++;
               swap(arr, i, j);
           }
           swap(arr, i+1, e);
        }
        return i+1;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //taking random element as pivot
    static void quickSort2(int[] arr, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        quickSort2(arr, low, e);
        quickSort2(arr, s, hi);
    }
}
