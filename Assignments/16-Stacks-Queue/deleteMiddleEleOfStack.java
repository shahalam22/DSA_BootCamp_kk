package StackAndQueue;

import java.util.Stack;

public class deleteMiddleEleOfStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        int size = stk.size();
        int mid = (size+1)/2;

        int[] str = new int[mid-1];

        for(int i=0; i<mid-1; i++){
            str[i] = stk.pop();
        }

        int deleted = stk.pop();

        for(int i=mid-2; i>=0; i--){
            stk.push(str[i]);
        }

        System.out.println(stk);
    }
}
