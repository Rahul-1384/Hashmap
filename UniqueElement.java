import java.util.*;
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {5,5,5,2,2,2,1,7,8,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key+" ");
            }
        }
    }
}
