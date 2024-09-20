// Print in Sorted order

import java.util.*;

public class treeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> tMap = new TreeMap<>();
        tMap.put("lsdC", 67);
        tMap.put("D", 68);
        tMap.put("fjklsE", 69);
        tMap.put("laF", 70);
        tMap.put("Aksdj", 65);
        tMap.put("Bjlk", 66);

        System.out.println(tMap);
        // Traversal
        for(String key : tMap.keySet()){
            System.out.println(tMap.get(key));
        }
        
    }
}
