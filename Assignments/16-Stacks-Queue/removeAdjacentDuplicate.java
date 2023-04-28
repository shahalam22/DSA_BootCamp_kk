package StackAndQueue;

import java.util.Stack;

public class removeAdjacentDuplicate {
    public static void main(String[] args) {
        String s = "azxxzy";

        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
            }
            else if(stk.peek()==s.charAt(i)){
                stk.pop();
            }
            else if(stk.peek()!=s.charAt(i)){
                stk.push(s.charAt(i));
            }
        }
        int size = stk.size();
        char[] str = new char[size];
        for(int i=size-1; i>=0; i--) {
            str[i] = stk.pop();
        }
        System.out.println(new String(str));
    }
}
