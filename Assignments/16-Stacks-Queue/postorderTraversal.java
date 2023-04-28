package StackAndQueue;

import java.util.Stack;

public class postorderTraversal {

    static class Node{
        int data;
        Node left, right;
        public Node(int val){
            this.data = val;
        }
    }

    static class binaryTree{
        Node root;
        public void postOrder(){

            Stack<Node> stk1 = new Stack<>(), stk2 = new Stack<>();
            stk1.push(root);

            while(!stk1.isEmpty()){
                Node curr = stk1.pop();
                stk2.push(curr);

                if(curr.left!=null){
                    stk1.push(curr.left);
                }
                if(curr.right!=null){
                    stk1.push(curr.right);
                }
            }

            while(!stk2.isEmpty()){
                Node temp = stk2.pop();
                System.out.println(temp.data+" ");
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
        tree.postOrder();
    }
}
