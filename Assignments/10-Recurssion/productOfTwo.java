//https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class productOfTwo {
    public static void main(String[] args) {
        System.out.println(product(100, 5));
    }

    static int product(int a, int b){
        if(a<b) return product(b,a);
        else if(b!=0) return a+product(a, b-1);
        else return 0;
    }
}
