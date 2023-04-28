package StackAndQueue;

//933. Number of Recent Calls
import java.util.ArrayList;

public class NumberOfRecentCall {
    public static void main(String[] args) {

    }
    class RecentCounter {

        ArrayList<Integer> list;

        public RecentCounter() {
            list = new ArrayList<>();
        }

        public int ping(int t) {
            this.list.add(t);
            int count=0;
            for(int i=0; i<this.list.size(); i++){
                if(this.list.get(i)>= (t-3000) && this.list.get(i)<=t){
                    count++;
                }
            }
            return count;
        }
    }

    /*solution using queue

    class RecentCounter {
        Queue<Integer> list;
        public RecentCounter() {
            list = new LinkedList<>();
        }
        public int ping(int t) {
            this.list.add(t);
            while(this.list.peek()<t-3000){
                this.list.poll();
            }
            return this.list.size();
        }
    }
    */
}
