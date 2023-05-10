//Trie || Digital search tree || Retrieval tree || prefix tree
//dictionary te word search er jonno eta use hoy || k-ary tree : ekta node er child 2 er beshi hoite pare
//time complexity O(L) [L = highest length of word] where valanced binary tree has time complexity O(H) [H = total height of the tree]
//root node e kono value set thake na


public class practice3 {

    //defining trie class
    static class node{
        node[] children;
        boolean eow;
        public node(){
            this.children = new node[26];
            for(int i=0; i<26; i++){
                this.children[i] = null;
            }
            this.eow = false;
        }
    }
    //creating root node object of trie
     static node root = new node();

    //inserting words in trie class | time complexity : O(L)
    public static void insert_word(String word){
        node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    //search in trie    |   O(L)
    public static boolean search(String key){
        node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx] != null) {
                if(i==(key.length()-1) && curr.children[idx].eow == true){
                    return true;
                }
            }
            curr = curr.children[idx];
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for(int i=0; i< words.length; i++){
            insert_word(words[i]);
        }
        System.out.println(search("ther"));
    }
}
