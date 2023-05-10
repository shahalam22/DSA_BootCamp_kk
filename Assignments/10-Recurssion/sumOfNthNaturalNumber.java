//https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class sumOfNthNaturalNumber {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n==0) return 0;
        return n + sum(n-1);
    }
}
