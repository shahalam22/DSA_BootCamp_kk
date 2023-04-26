import java.util.*;

public class HashingMap {
    public static void main(String[] args) {
        //where we have to save pairs of data, there we use HashMap. One is key[this is unique] and another is value[may be unique or not]
        //we can use HashMap to store roll and corresponding name. here roll holo key and name holo value.

        //creating HashMap -- country[key] population[value]
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        //key age exist na korle new key & value add kore ||| jodi key age theke exist kore tahole new value diye ager value k replace kore
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //Search
        //same work as HashSet -- key exist kore ki na.
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        //.get method lies in "Search"
        //if key exists then returns the corresponding value of the key ||| if key doesn't exists the returns "NULL"
        System.out.println(map.get("China"));
        System.out.println(map.get("Insonesia"));

        //Iteration
        //here we will use for each loop || form will be like : for(Map.Entry(keyType, valueType) iterator[variable] : map.entrySet())
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " -> ");
            System.out.println(e.getValue());
        }
        //search er khetre amra key diye value khuje pai just. But, iterative process e amra individually key & value access korte pari, karon hoilo "map.entrySet()" er maddhome HashMap ke set e convert kore neya hoyeche.

        // ".entrySet" method er maddhome key & value both niye set toiri hoy
        // ".keySet" method er maddhome just key gula niye set banano hoy.
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+" -> "+map.get(key));
        }

        //Remove -- map.remove(key)
        map.remove("China");
        System.out.println(map);
    }
}
