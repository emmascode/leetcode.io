class AverageValueOfEvenNumbersThatAreDivisiblebyThree {
    public static int averageValue(int[] nums) {
        int count =  0;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                count++;
                sum += nums[i];
            }
            if (count == 0) {
                average =  0;
            } else {
                average = sum / count;
            }
        }
        return average;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,6,10,12,15};
        System.out.println(AverageValueOfEvenNumbersThatAreDivisiblebyThree.averageValue(nums));
    }
}
