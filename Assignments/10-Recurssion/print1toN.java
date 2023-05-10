//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class print1toN {
    public static void main(String[] args) {
        printN(10);
    }
    static void printN(int n){
        if(n==0) return;
        printN(n-1);
        System.out.print(n+" ");
    }
}
