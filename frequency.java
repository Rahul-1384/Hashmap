import java.util.*;
public class frequency {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : arr){
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
    
}
