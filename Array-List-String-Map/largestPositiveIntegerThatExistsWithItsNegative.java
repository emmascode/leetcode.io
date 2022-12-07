class largestPositiveIntegerThatExistsWithItsNegative {
    public static boolean check(int[] nums, int x) {
        for (int i=0; i<nums.length; i++){
            if (nums[i] == x){
                return true;
            }
        }
        return false;
    }

    public static int findMaxK(int[] nums) {
        int maxValue = -1;
        for (int i=0; i<nums.length; i++){
            if (nums[i] > 0 && check(nums, -nums[i])){
                if (nums[i] > maxValue){
                    maxValue = nums[i];
                }
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {-1,10,6,7,-7,1};
        int x = 7;
        System.out.println(largestPositiveIntegerThatExistsWithItsNegative.check(nums, x));
    }
}
