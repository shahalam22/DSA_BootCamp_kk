//  https://www.geeksforgeeks.org/powet-set-lexicographic-order/

public class powerSet {

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        subseq(p, up.substring(1));
        subseq(p+up.charAt(0), up.substring(1));
    }

    public static void main(String[] args) {
        subseq("", "abc");
    }
}
