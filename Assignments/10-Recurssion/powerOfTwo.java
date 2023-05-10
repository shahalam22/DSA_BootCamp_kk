import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/power-of-two/
public class powerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        double val = Math.log10(n)/Math.log10(2);
        if(val - (int)val == 0) System.out.println(true);
        else System.out.println(false);
    }
}
