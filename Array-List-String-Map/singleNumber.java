import java.util.*;

class SingleNumber {
    public static int singleNumber(int[] nums) {
        int output = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                map.put(num, count +1);
            }
        }
        for (Integer num : nums) {
            if (map.get(num) == 1) {
                output = num;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[] num = new int[] {4,1,2,1,2};
        System.out.println(SingleNumber.singleNumber(num));
    }
}