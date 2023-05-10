//https://practice.geeksforgeeks.org/problems/geek-onacci-number/0
public class geekonacciNumber {
    public static void main(String[] args) {
        System.out.println(gonacci(1,3,2,6));
    }

    static int gonacci(int a, int b, int c, int n){
        if(n==1) return a;
        if(n==2) return b;
        if(n==3) return c;
        return gonacci(a,b,c,n-1) + gonacci(a,b,c,n-2) + gonacci(a,b,c,n-3);
    }
}
