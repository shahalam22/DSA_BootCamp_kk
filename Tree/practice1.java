//tree is a hierarchical data structure. Property of a tree - 1. Root, 2. Branch & 3. Leaf
//Root - Source node of the whole tree, Branch - straight line that connects one node to another, Leaf - which nodes doesn't have any child
//Binary tree - Which tree can have 2 children (maximum).

import java.util.LinkedList;
import java.util.Queue;

public class practice1 {

    //making node class
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

    //making binary search tree from preOrder sequence {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} where -1 means null
    static class binaryTree{
        static int ind = -1;
        public node buildTree (int[] arr){
            ind++;
            if(arr[ind] == -1) return null;

            node newNode = new node(arr[ind]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }

        //tree traversal -- PREORDER [1 of DSF of tree]
        public void preOrder(node root){
            if (root == null) return;
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

        //tree traversal -- POSTORDER [1 of DSF of tree]
        public void postOrder(node root){
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }

        //tree traversal -- INORDER [1 of DSF of tree]
        public void inOrder(node root){
            if (root == null) return;
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }

        //level order traversal -- BFS of tree
        //we will use queue here to do this. FIFO works best here.
        public void levelOrder(node root){
            Queue<node> que = new LinkedList<>();

            if(root == null) return;

            que.add(root);
            que.add(null);

            while(!que.isEmpty()){
                node currentNode = que.remove();
                if(currentNode == null){
                    System.out.println();
                    if(que.isEmpty()) break;
                    else que.add(null);
                } else {
                    System.out.print(currentNode.data + " ");
                    if(currentNode.left != null){
                        que.add(currentNode.left);
                    }
                    if (currentNode.right != null){
                        que.add(currentNode.right);
                    }
                }
            }
        }

        //count of total node
        public int countN(node root){
            if(root == null) return 0;
            return 1 + countN(root.left) + countN(root.right);
        }

        //sum of the datum of the nodes
        public int sumN(node root){
            if(root == null) return 0;
            return root.data + sumN(root.left) + sumN(root.right);
        }

        //height of tree
        public int height(node root){
            if(root==null) return 0;
            int lh = 1 + height(root.left);
            int rh = 1 + height(root.right);
//            if(lh>rh) return lh;
//            else return rh;
            return Math.max(lh, rh);
        }

        //diameter of a tree
        //case-1: -- pass through root
        //case-2: -- not passed through the root

        //approach-1 | time complexity - n*n || etar time complexity n*n howar karon hocche amra ei method theke abar height method ke call korechi. tai n(diameter method)*n(height method)
        public int diameter(node root){
            if(root == null) return 0;
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            int passByRoot = 1 + height(root.left) + height(root.right);

            return Math.max(passByRoot, Math.max(ld, rd));
        }

        //approach-2 | time complexity - n || ekhane amra tree info nam er class banaya eki sathe ekta node er height & diameter pass korbo tahole amader extra height method ana lagbe na jar fole amader complexity hobe n.
        static class treeInfo{
            int ht;
            int dia;
            public treeInfo(int ht, int dia){
                this.ht = ht;
                this.dia = dia;
            }
        }

        public treeInfo diameter2(node root){
            if(root == null){
//                treeInfo mynode = new treeInfo(0,0);
//                return mynode;
                return new treeInfo(0,0);
            }

            treeInfo left = diameter2(root.left);
            treeInfo right = diameter2(root.right);

            int myht = Math.max(left.ht, right.ht) + 1;

            int dia1 = left.dia;
            int dia2 = right.dia;
            int dia3 = left.ht + right.ht + 1;

            int mydia = Math.max(dia1, Math.max(dia2, dia3));

            treeInfo mynode = new treeInfo(myht, mydia);

            return mynode;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        node root = tree.buildTree(arr);
        //System.out.println(root.data);
        //tree.preOrder(root);
        //tree.postOrder(root);
        //tree.postOrder(root);
        //tree.levelOrder(root);
        //System.out.println(tree.countN(root));
        //System.out.println(tree.sumN(root));
        //System.out.println(tree.height(root));
        //System.out.println(tree.diameter(root));
        //System.out.println(tree.diameter2(root).dia);
    }
}
