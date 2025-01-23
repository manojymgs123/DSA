import java.util.*;
public class HashSetIteineraryTictket {
    public static String getstart(HashMap<String,String> tickets){

        HashMap<String,String> revMap = new HashMap<>();

        //interchange the key and value

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        //find odd one
        
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
               return key; // starting point 
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa",  "chennai");
        tickets.put("delhi", "goa");

        String start = getstart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("-> "+ tickets.get(start));
            start = tickets.get(start);
        }

    }
    
}
