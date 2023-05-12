//  https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/


public class checkConsecutiveDuplicate {

    public static String conDuplicate(String str, int i, int j){
        if(str.length()==1 || j == str.length()){
            return str.charAt(i) + "";
        }
        if(str.charAt(i)!=str.charAt(j)){
            return str.charAt(i) + conDuplicate(str, j, j+1);
        }
        else return conDuplicate(str, i, j+1);
    }

    public static void main(String[] args) {
        String S = "aabccba";
        System.out.println(conDuplicate(S, 0, 1));
    }

}
