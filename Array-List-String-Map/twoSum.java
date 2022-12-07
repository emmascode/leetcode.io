import java.util.Map;
import java.util.HashMap;


class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(nums[i])) return new int[]{map.get(nums[i]), i};
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(TwoSum.twoSum(nums, target));
    }
}

// import java.util.List;
// import java.util.ArrayList;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i+1; j < nums.length; j++) {
//             if (nums[i] + nums[j] == target) {
//                 return new int[] {i, j};
//             }
//         }
//     }
//     return null; 
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         List<Integer> lst = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (lst.contains(nums[i])) {
//                 return new int[] {lst.indexOf(nums[i]), i};
//             }
//             lst.add(target - nums[i]);
//         }
//         return null;
//     }
// }    

