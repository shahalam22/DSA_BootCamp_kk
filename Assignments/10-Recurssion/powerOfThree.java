//https://leetcode.com/problems/power-of-three/
public class powerOfThree {
    public static void main(String[] args) {
        int n = 16;
        double val = Math.log10(n)/Math.log10(3);
        if(val - (int)val == 0) System.out.println(true);
        else System.out.println(false);
    }
}
