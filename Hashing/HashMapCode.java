import java.util.*;
public class HashMapCode {
    static class  HashMap<K, V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        //blackbox hashFunction
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }

        //search in the Linked List
        private int searchInLinkedList(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }

            return -1;
        }

        //rehashing
        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int k=0; k< buckets.length; k++){
                buckets[k] = new LinkedList<>();
            }

            for(int i=0; i<oldbucket.length; i++){
                LinkedList<Node> ll = oldbucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        //put function
        public void put(K key, V value){
            int bi = hashFunction(key); // this function will take input on give an encoded output by hashing. It will calculate bucket index and return index number according to the encoded version
            int di = searchInLinkedList(key, bi); // this function will find out whether our key exists or not in the buckets

            if(di==-1){
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0) {
                //rehashing
                rehash();
            }
        }
        //contains function
        public boolean containsKey(K key){
            int bi = hashFunction(key); // this function will take input on give an encoded output by hashing. It will calculate bucket index and return index number according to the encoded version
            int di = searchInLinkedList(key, bi); // this function will find out whether our key exists or not in the buckets

            if(di==-1){
                return false;
            } else {
                return true;
            }
        }
        //remove function
        public V remove(K key){
            int bi = hashFunction(key); // this function will take input on give an encoded output by hashing. It will calculate bucket index and return index number according to the encoded version
            int di = searchInLinkedList(key, bi); // this function will find out whether our key exists or not in the buckets

            if(di==-1){
                return null;
            } else {
                Node node = buckets[bi].get(di);
                buckets[bi].remove(di);
                n--;
                //uporer 2 line ke evabeo lekha jay :: Node node = buckets[bi].remove(di);
                return node.value;
            }
        }
        //get function
        public V get(K key){
            int bi = hashFunction(key); // this function will take input on give an encoded output by hashing. It will calculate bucket index and return index number according to the encoded version
            int di = searchInLinkedList(key, bi); // this function will find out whether our key exists or not in the buckets

            if(di==-1){
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }

    }

    //this below function is the main function. Now, implement upper codes here
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 220);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for(int i=0; i< keys.size(); i++){
            System.out.println(keys.get(i)+" -> "+map.get(keys.get(i)));
        }
    }
}
