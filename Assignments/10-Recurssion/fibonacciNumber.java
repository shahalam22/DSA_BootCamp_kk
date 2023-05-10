//https://leetcode.com/problems/fibonacci-number/submissions/
public class fibonacciNumber {
    public static void main(String[] args) {
        int b = fibo(3);
        System.out.println(b);
    }

    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
