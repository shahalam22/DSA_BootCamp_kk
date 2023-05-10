//https://leetcode.com/problems/power-of-four/
public class powerOfFour {
    public static void main(String[] args) {
        int n = 16;
        double val = Math.log10(n)/Math.log10(4);
        if(val - (int)val == 0) System.out.println(true);
        else System.out.println(false);
    }
}
