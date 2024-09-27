import java.util.*;
public class SubarraySum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {1,1,1,1,1,1,1,7,5,2,6,1};
        int k = 7;
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                if(i-map.get(sum - k) > max){
                    start = map.get(sum - k) + 1;
                    end = i;
                    max = i-map.get(sum-k);
                }
            }
            map.put(sum, i);
        }
        System.out.println(start+", "+end);
    }

}
