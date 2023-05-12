import java.util.ArrayList;

//https://www.geeksforgeeks.org/check-for-balanced-parenthesis-without-using-stack/

public class balancedParenthesis {

    public static boolean balancedParenthesis(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            list.add(str.charAt(i));
        }
        return check(list, 0);
    }

    public static boolean check(ArrayList<Character> str, int i){
        if(str.size()==0) return true;
        if(str.size()%2 == 1){
            return false;
        }
        if(str.get(i)=='[' || str.get(i)=='{' || str.get(i) == '('){
            return check(str, i + 1);
        }
        else if(str.get(i)==']' && str.get(i-1)=='['){
            str.remove(i);
            str.remove(i-1);
            return check(str, i - 1);
        }
        else if(str.get(i)=='}' && str.get(i-1)=='{'){
            str.remove(i);
            str.remove(i-1);
            return check(str, i - 1);
        }
        else if(str.get(i)==')' && str.get(i-1)=='('){
            str.remove(i);
            str.remove(i-1);
            return check(str, i - 1);
        }
        else return false;
    }

    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";

        System.out.println(balancedParenthesis(str));
    }

}
