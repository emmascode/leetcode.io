import java.util.*;

class mostFrequentEvenElement {
    public static int findMostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    if (map.containsKey(nums[i])) {
                        count = map.get(nums[i]); 
                        count++;
                        map.put(nums[i], count);
                    } else {
                        map.put(nums[i], 1);
                    } 
                } else {
                    continue;
                }
            }        
        if (map.size() == 0) {
            return -1;
        } else {
            int maxFrequency = -1;
            int minValue = 999999;
            for (Integer value : map.keySet()) {
                int frequency = map.get(value);
                if (frequency > maxFrequency ) {
                    maxFrequency = frequency;
                    minValue = value;
                } else if (frequency == maxFrequency) {
                    if (value < minValue) {
                        minValue = value;
                    }
                }
            }
            return minValue;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEvenElement.findMostFrequentEven(nums));
    }
}
