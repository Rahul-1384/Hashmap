// Print in random order

import java.util.*;
public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 65);
        map.put("B", 66);
        map.put("C", 67);
        map.put("D", 68);
        map.put("E", 69);
        map.put("F", 70);
        // map.put(null, 12);
        // map.put(null, null);

        System.out.println(map);

        // Iterate over HashMap
        for(String key: map.keySet()){
            System.out.println(key +" : "+ map.get(key));
        }


        // Mostly used methods

        // it will give true or false if the key is present in the map
        System.out.println(map.containsKey("F"));

        // it will check first either the DS key is present in map or not if present then the value of that key is incremented by 2
        // if not present then the key will be added in the map with its defaultvalue 100.
        System.out.println(map.getOrDefault("DS", 100) + 2);
        System.out.println(map);

    }
}