package demo.recursionPractice;

public class findSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,4};
        System.out.println(sortedArray(arr, 0));
    }
    static boolean sortedArray(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]) && sortedArray(arr, index+1);
    }
}
