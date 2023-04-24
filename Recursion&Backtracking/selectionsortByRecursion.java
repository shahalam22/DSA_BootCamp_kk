package demo.recursionPractice;

import java.util.Arrays;

public class selectionsortByRecursion {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr, arr.length,0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c, int max){
        if(r==0) return;
        if (c<r) {
            if(arr[c]>arr[max]) sort(arr, r, c+1, c);
            else sort(arr, r, c+1, max);
        }
        else {
            swap(arr, max, r-1);
            sort(arr, r-1, 0, 0);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
