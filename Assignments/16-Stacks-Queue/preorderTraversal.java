package StackAndQueue;

import java.util.Stack;

public class preorderTraversal {

    static class Node {
        int data;
        Node left, right;
        public Node(int val){
            this.data = val;
            left = right = null;
        }
    }

    static class binaryTree{
        Node root;
        public void preorder(){
            if(root==null){
                return;
            }
            Stack<Node> stk = new Stack<>();
            Node curr = root;
            while (curr!=null || stk.size()>0){
                while(curr!=null){
                    System.out.println(curr.data+" ");
                    stk.push(curr);
                    curr = curr.left;
                }
                curr = stk.pop();
                curr = curr.right;
            }
        }
    }
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.preorder();
    }
}
