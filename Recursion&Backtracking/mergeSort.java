package demo.recursionPractice;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {3,9,5,4,6,2,8,7,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //way 1 : eita te memory beshi lagse karon extra 2ta array neya lagse. But, time kom lagse
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int lenNew = len1 + len2;
        int[] arrNew = new int[lenNew];

        int i = 0, j = 0, k = 0;

        while(i<len1 && j<len2) {
            if(arr1[i]<arr2[j]) {
                arrNew[k] = arr1[i];
                i++;
            }
            else {
                arrNew[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<len1) {
            arrNew[k] = arr1[i];
            k++;
            i++;
        }
        while (j<len2){
            arrNew[k] = arr2[j];
            k++;
            j++;
        }
        return arrNew;
    }

    //way 2
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s ==1){
            return;
        }
        int mid = (s+e)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, e, mid);
    }
    static void mergeInPlace(int[] arr, int s, int e, int mid){
        int[] arrNew = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

        while(i<mid && j<e) {
            if(arr[i]<arr[j]) {
                arrNew[k] = arr[i];
                i++;
            }
            else {
                arrNew[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<mid) {
            arrNew[k] = arr[i];
            k++;
            i++;
        }
        while (j<e){
            arrNew[k] = arr[j];
            k++;
            j++;
        }
        for(int l=0; l<arrNew.length; l++){
            arr[s+l] = arrNew[l];
        }
    }
}
