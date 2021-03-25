package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1234, "Kamal");
        m.put(4321, "Karim");
        m.put(5678, "Fatima");
        System.out.println(m.get(1234));
        m.remove(4321);
        System.out.println(m);
        System.out.println();
        System.out.println(m.keySet());
        System.out.println(m.entrySet());
        List<String> cake=new ArrayList<>();
        cake.add("Chocolate");
        cake.add("IceCream");
        List<String> cookies=new ArrayList<>() ;
        cookies.add("GingerBread");
        cookies.add("ButterCookie");
        cookies.add("Macaroons");
        Map<String, List <String>> f = new HashMap<>();
        f.put("ButterCookie",cookies);
        f.put("Tiramisu", cake);
        for(Map.Entry<String, List<String>> sweet: f.entrySet()){
            System.out.println(sweet.getKey() );
            System.out.println(sweet.getValue());




        }

    }
    }


