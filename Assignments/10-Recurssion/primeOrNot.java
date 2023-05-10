//https://www.geeksforgeeks.org/recursive-program-prime-number/
public class primeOrNot {
    public static void main(String[] args) {
        int x = 49;
        System.out.println(primeornot(x, x-1));
    }
    static boolean primeornot(int x, int i){
        if(x<=2 || i==1) return true;
        else if(i>2 && i<x && x%i==0) return false;
        else return primeornot(x, i-1);
    }
}
