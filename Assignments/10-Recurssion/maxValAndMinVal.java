//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class maxValAndMinVal {
    public static void main(String[] args) {
        int[] num = {1,4,3,-5,-4,8,6};

        int min = findMin(num, num.length);
        int max = findMax(num, num.length);

        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
    }
    public static int findMin(int[] num, int n){
        if(n==1) return num[0];
        return Math.min(num[n-1], findMin(num, n-1));
    }
    public static int findMax(int[] num, int n){
        if(n==1) return num[0];
        return Math.max(num[n-1], findMin(num, n-1));
    }
}
