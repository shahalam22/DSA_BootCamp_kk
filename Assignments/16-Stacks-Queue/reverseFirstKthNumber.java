package StackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
public class reverseFirstKthNumber {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        int k = 4;

        int size = que.size();
        int[] num = new int[size];
        for(int i=k-1; i>=0; i--){
            num[i] = que.poll();
        }

        for(int j=k; j<size; j++){
            num[j] = que.poll();
        }

        for(int i=0; i<size; i++){
            que.add(num[i]);
        }

        System.out.println(Arrays.toString(num));
    }
}
