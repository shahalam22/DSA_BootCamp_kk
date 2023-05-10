import java.util.Arrays;

//https://www.geeksforgeeks.org/check-for-balanced-parenthesis-without-using-stack/

//IT'S INCOMPLETE
public class balancedParenthesis {
    public static void main(String[] args) {

    }
    public static boolean check(String str, int i){
        if(str.length()==0) return true;
        if(str.length()%2==1) return false;
        if(str.charAt(0)==')' || str.charAt(0) =='}' || str.charAt(0)==']') return false;
        if(str.charAt(0)=='(' || str.charAt(0)=='{' || str.charAt(0)=='['){
            char closing = reeturnClosing(str.charAt(0));

            int j=0, count =0;
            for( j=1; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(0)){
                    count++;
                }
                if(str.charAt(j)==closing){
                    if(count==0) break;
                    count--;
                }
            }
            if(j==str.length()) return false;

        }
        return false;
    }

    static char reeturnClosing(char ch){
        if (ch=='(') return ')';
        if (ch=='{') return '}';
        if (ch=='[') return ']';
        return Character.MIN_VALUE;
    }
}
