// Maintain insertion order

import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
        lMap.put("D", 68);
        lMap.put("E", 69);
        lMap.put("A", 65);
        lMap.put("B", 66);
        lMap.put("C", 67);
        lMap.put("F", 70);

        System.out.println(lMap);

        // Traversal
        for(String key : lMap.keySet()){
            System.out.println(key + " : " + lMap.get(key));
        }
    }
}
