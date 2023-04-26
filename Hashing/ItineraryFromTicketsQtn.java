import java.util.HashMap;

/*"Chennai" -> "Bengaluru"
"Mumbai" -> "Delhi"
"Goa" -> "Chennai"
"Delhi" -> "Goa"

amake ei tickets gula deya hoise & bola hoise ekta particular city theke ber hoye sokol city ghurar ekta way ber korte
answer will be : "Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Bengaluru"
[here will be no loops or such action that you could visit 2 cities from 1]
*/
public class ItineraryFromTicketsQtn {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        itineraryTickets(tickets);
    }

    static void itineraryTickets(HashMap<String, String> maps ){
        String start = getStart(maps);

        while (maps.containsKey(start)){
            System.out.print(start + " -> ");
            start = maps.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String, String> maps){
        HashMap<String, String> revMaps = new HashMap<>();

        for(String key:maps.keySet()){
            revMaps.put(maps.get(key), key);
        }

        for(String key:maps.keySet()){
            if(!revMaps.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}
