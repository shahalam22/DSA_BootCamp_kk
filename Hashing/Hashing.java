import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();
        //it's same like ArrayList<Integer> list = new ArrayList<>();

        //insert value to set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //here, second 1 won't be added because duplicate doesn't allowed

        //size of the set
        System.out.println("Size of the set : "+set.size());

        //print all the elements of the set
        System.out.println(set);

//        //search -- contains [this contains return type is Boolean. If set contains value than it returns "true" else "false"]
//        if(set.contains(1)){
//            System.out.println("Set contains 1");
//        }
//        if(!set.contains(6)){
//            System.out.println("Set doesn't contains 6");
//        }
//
//        //remove value
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("Set doesn't contains 1 -- we have deleted 1");
//        }

        //Iterator -- this is a special thing in HashSet concept. This gives us an iterator variable by which we can iterate all over the set
        //It has 2 method. 1. next - which gives us to access next value of the set [it is not mandatory that amra jevabe input dilam value gula sevabe thakbe. Set e value gula jekono sequence ei thakte pare]
        //2. hasNext - this method returns "true" if there exists any value in set next to current value. Returns "false" if there has no value in the set next to the current value.

        //making Iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
