//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class firstUpperCase {
    public static void main(String[] args) {
        String str = "PeeksforgeeKS";
        int v = fucase(str, 0);
        System.out.println(str.charAt(v));
    }

    public static int fucase(String str, int n){
        if(str.charAt(n)<'a') return n;
        return fucase(str, n+1);
    }
}
