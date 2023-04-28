package StackAndQueue;

import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s = "]";

        Stack<Character> stac = new Stack<>();
        int i=0, flag=0;
        while(i!=s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stac.push(s.charAt(i));
            }
            if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(stac.isEmpty()) stac.push(s.charAt(i));
                else if(s.charAt(i)==')' && stac.peek()=='('){
                    stac.pop();
                } else if(s.charAt(i)==']' && stac.peek()=='['){
                    stac.pop();
                } else if(s.charAt(i)=='}' && stac.peek()=='{'){
                    stac.pop();
                }
                else flag = 1;
            }
            i++;
        }
        if(!stac.isEmpty()) flag = 1;
        if(flag==1) System.out.println("false");
        else System.out.println("true");
    }
}
