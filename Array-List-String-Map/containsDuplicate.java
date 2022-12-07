import java.util.*;
class ContainsDuplicate {
    public static boolean findContainsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j = 1;
        int l = nums.length-1;
        while(i<l){
            if(nums[i] == nums[j]){
                return true;
            } else {
                i++;
                j++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1};
        System.out.println(ContainsDuplicate.findContainsDuplicate(nums));
    }
}