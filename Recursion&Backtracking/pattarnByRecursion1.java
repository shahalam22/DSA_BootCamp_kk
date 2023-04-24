package demo.recursionPractice;

public class pattarnByRecursion1 {
    public static void main(String[] args) {
        pattarn1(5,0);
        pattern2(5,0);
    }
    static void pattarn1(int r, int c){
        if(r==0) return;
        if (c<r) {
            System.out.print("* ");
            pattarn1(r, c+1);
        }
        else {
            System.out.println();
            pattarn1(r-1, 0);
        }
    }

    static void pattern2(int r, int c){
        int n = r;
        helper2(r, c, n);
    }
    static void helper2(int r, int c, int n){
        if(r==0) return;
        if (c<n-r+1) {
            System.out.print("* ");
            helper2(r, c+1, n);
        }
        else {
            System.out.println();
            helper2(r-1, 0, n);
        }
    }
}
