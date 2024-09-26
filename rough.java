// import java.util.*;
// public class rough {
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    System.out.println("Input test cases");
// 	    int t = sc.nextInt();
// 	    while(t > 0){
// 	        String s = sc.next();
// 	        int q = 0;
// 	        int a = 0;
// 	        for(int i=0;i<s.length();i++){
// 	            if(s.charAt(i) == 'q'){
// 	                q++;
// 	            }
// 	            if(s.charAt(i) == 'a'){
// 	                a++;
// 	            }
// 	        }
// 	        if(q<=a){
// 	            if(s.charAt(s.length()) == 'q'){
// 	                System.out.print("NO"+" ");
// 	            }else{
// 	                System.out.print("YES"+" ");
// 	            }
// 	        }
// 	        t--;
// 	    }
//         sc.close();
// 	}
// }



// import java.util.*;
// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         List<Integer> list = new ArrayList<>();
//         int idx = 0;
//         for(int i=0;i<nums1.length;i++){
//             while(idx < nums2.length){
//                 if(nums1[i] == nums2[idx]){
//                     list.add(nums2[idx]);
//                     break;
//                 }
//                 idx++;
//             }
//         }
//         int[] arr = new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             arr[i] = list.get(i);
//         }
//         return arr;
//     }
// }



class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        for(int i=0;i<nums.length;i++){
            if(i == nums.length-1){
                nums[i] = nums[i] - k;
                break;
            }
            if(nums[i] <= max){
                nums[i] = nums[i] + k;
            }
        }
        Arrays.sort(nums);
        int maxF = nums[nums.length-1];
        int minF = nums[0];
        return maxF - minF;
    }
}