package StackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class minStack {
    public static void main(String[] args) {

    }
    class MinStack {
        Stack<Integer> s;
        ArrayList<Integer> list;
        public MinStack() {
            this.s = new Stack<>();
            this.list = new ArrayList<>();
        }
        public void push(int val) {
            this.s.push(val);
            this.list.add(val);
        }
        public void pop() {
            this.list.remove(this.s.peek());
            this.s.pop();
        }
        public int top() {
            return this.s.peek();
        }
        public int getMin() {
            int[] arr = new int[this.list.size()];
            for(int i=0; i<arr.length; i++){
                arr[i] = list.get(i);
            }
            Arrays.sort(arr);
            return arr[0];
        }
    }
}
