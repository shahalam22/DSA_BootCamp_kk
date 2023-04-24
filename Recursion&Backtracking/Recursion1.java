package demo.recursionPractice;

public class Recursion1 {

    static void message(int i){
        if(i<=0) return;
        System.out.println("Hello World");
        i--;
        message(i);
    }
    static void printNumAsc(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        printNumAsc(n-1);
        System.out.println(n);
    }
    static void printNumDec(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        /*if we do "printNumDec(n--)" our code will show stack overflow.
        It will show proper result if we write "printNumDec(--n)".
        Because n-- will pass n first, then subtract 1 from n. On the other
        hand, --n will subtract 1 from n first, then pass n.
        */
        printNumDec(--n);
    }
    static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    static int sumOfDigits(int n){
        if(n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }
    static int prodOfDigits(int n){
        if(n==0) return 1;
        return n%10 * prodOfDigits(n/10);
    }

    static int sum = 0;
    static void reverseNum1(int n){
        if(n==0) return;
        int rem = n %10;
        sum = sum*10 + rem;
        reverseNum1(n/10);
    }
    //reverse 2 is not working properly
    static int reverseNum2(int n){
        //sometimes you might need somw additional variables in the argument
        //in that case, make another funtion
        int digits = (int)(Math.log10(n))+1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1) + helper(n/10, digits-1));
    }
    static int fact(int n){
        if(n==0) return 1;
        return fact(n-1)*n;
    }
    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-2) + fibo(n-1);
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e || target>arr[arr.length-1]) return -1;
        int mid = (s + (e-s)/2);
        if(target==arr[mid]) return mid;
        if(target<arr[mid]){
            return search(arr, target, s, mid-1);
        }
        return search(arr, target, mid+1, e);
    }
    static boolean paliondrom(int n){
        reverseNum1(n);
        return n == sum;
    }

    //main methode
    public static void main(String[] args) {
//        message(5);
//        printNumDec(5);
//        System.out.println(sum(8));
//        System.out.println(sumOfDigits(123456789));
//        System.out.println(prodOfDigits(1234));
//        int x = fact(5);
//        System.out.println(x);
//        System.out.println(fibo(5));
//        int[] arr = {1,5,9,12,25,26,45};
//        int target = 759;
//        System.out.println(search(arr, target, 0, arr.length));
//        reverseNum1(1234);
//        System.out.println(sum);
//        System.out.println(reverseNum2(5678));
//        System.out.println(paliondrom(12281));
    }
}
