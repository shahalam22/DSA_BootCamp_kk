//https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOf(12345));
    }

    static int sumOf(int num){
        if(num==0) return 0;
        return num%10 + sumOf(num/10);
    }
}
