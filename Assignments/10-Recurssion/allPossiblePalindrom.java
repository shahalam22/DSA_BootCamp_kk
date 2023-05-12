//  https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/

public class allPossiblePalindrom {

    public static void subseq(String p){
        for(int i=0; i<p.length(); i++){
            for(int k=0; k<p.length()-i; k++){
                if(isPalindrom(p.substring(k, k+1+i))){
                    System.out.println(p.substring(k, k+1+i));
                }
            }
        }
    }

    public static boolean isPalindrom(String str){
        if(str.length() == 0) return true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        subseq("geeks");
    }
}
