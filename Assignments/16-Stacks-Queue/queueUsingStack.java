package StackAndQueue;

import java.util.Stack;

public class queueUsingStack {

    class MyQueue {
        Stack<Integer> stk;
        public MyQueue() {
            stk = new Stack<>();
        }
        public void push(int x) {
            if(stk.isEmpty()) stk.push(x);
            else{
                Stack<Integer> demo = new Stack<>();
                while(!stk.isEmpty()){
                    demo.push(stk.pop());
                }
                stk.push(x);
                while(!demo.isEmpty()){
                    stk.push(demo.pop());
                }
            }
        }

        public int pop() {
            return stk.pop();
        }

        public int peek() {
            return stk.peek();
        }

        public boolean empty() {
            return stk.isEmpty();
        }
    }
    public static void main(String[] args) {

    }
}
