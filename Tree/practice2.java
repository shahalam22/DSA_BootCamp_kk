//Binary search tree practice | from Apna College

//BST er left e value choto hoy, right e value boro hoy
//BST inorder traversal will always give a sorted array
//BST te search er time complexity O(H) [H = height] | BT te search er time complexity O(n) [total node]
//Strategy :- Most of the BST & BT problems can be solved by recursion


import java.util.ArrayList;

public class practice2 {

    //building node
    static class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //insert function
    public static node insert_node(node root, int value){
        node newN = new node(value);
        if(root == null){
            root = newN;
            return root;
        }
        if(value > root.data){
            root.right =  insert_node(root.right, value);
        } else {
            root.left = insert_node(root.left, value);
        }
        return root;
    }

    //inOrder traversal
    public static void inOrder(node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    //search key  | time complexity : O(H)
    public static boolean search(node root, int val){
        if(root==null) return false;
        if(root.data == val) return true;
        return search(root.left, val) || search(root.right, val);
    }

    //delete a node
    public static node delete_node(node root, int val){
        if(val>root.data){
            root.right = delete_node(root.right, val);
        }
        else if(val<root.data){
            root.left = delete_node(root.left, val);
        }
        else{   //when root.data == val
            //case-1: when target has no child
            if(root.left==null && root.right==null){
                return null;
            }
            //case-2: when target has one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case-3: when target have 2 child. In this case we have to find out the INORDER SUCCESSOR [in order traversal e target er porer value] then replace target's value with the successor's value and delete the successor node as like case-1 or case-2.
            //this successor will only have 0 or 1 child.
            node is = inorderSuccessor(root, val);
            root.data = is.data;
            root.right = delete_node(root.right, is.data);
        }
        return root;
    }

    public static node inorderSuccessor(node root, int val){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    //print in range from X to Y
    public static void printInRange(node root, int from, int to){
        if(root == null ) return;
        if(root.data < from){
            printInRange(root.right, from, to);
        }
        else if(root.data > to){
            printInRange(root.left, from, to);
        }
        else { //if root.data >= from && root.data<=from
            printInRange(root.left, from, to);
            System.out.println(root.data);
            printInRange(root.right, from, to);
        }
    }

    //all the roads towards leaf
    public static void roadToLeaf(node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);

        if(root.left==null && root.right==null){
            System.out.println(path);
        }else {
            roadToLeaf(root.left, path);
            roadToLeaf(root.right, path);
        }

        path.remove(path.remove(path.size()-1));
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        node root = null;
        for(int i=0; i< values.length; i++){
            root = insert_node(root, values[i]);
        }
//        inOrder(root);
//        System.out.println(search(root, 5));
//        inOrder(root);
//        delete_node(root, 4);
//        inOrder(root);
//        printInRange(root, 3,7);
//        roadToLeaf(root, new ArrayList<>());

    }
}
