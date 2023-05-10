//https://www.codechef.com/problems/FIBXOR01/
public class specialFibonacciNumbers {
    public static void main(String[] args) {
        int b = sFibo(15, 86, 77);
        System.out.println(b);
    }
    static int sFibo(int n, int a, int b){
        if(n==0) return a;
        if(n==1) return b;
        return sFibo(n-1, a, b)^sFibo(n-2, a, b);
    }
}
