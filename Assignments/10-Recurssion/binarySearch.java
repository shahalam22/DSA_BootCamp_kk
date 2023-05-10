import java.util.Arrays;

//https://leetcode.com/problems/binary-search/submissions/
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        Arrays.sort(arr);
        int n = binarysearch(arr, 0, arr.length-1, 9);
        System.out.println(n);
    }

    public static int binarysearch(int[] arr, int s, int e, int target){
        if(s>e) return -1;
        int mid = (s+e)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target){
            return binarysearch(arr, s, mid-1, target);
        }
        else {
            return binarysearch(arr, mid+1, e, target);
        }
    }
}
