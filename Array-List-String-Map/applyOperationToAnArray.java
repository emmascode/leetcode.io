import java.util.*;
import java.io.*;

class applyOperationToAnArray {
    public static int[] applyOperations(int[] nums) {
        for (int i  = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        List<Integer> lstOne = new ArrayList<>();
        List<Integer> lstTwo = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                lstOne.add(nums[i]);
            } else {
                lstTwo.add(nums[i]);
            }
        }

        int[] intArray = new int[nums.length];
        
        for (int i = 0; i < lstOne.size(); i++) {
            intArray[i] = lstOne.get(i);
        }
        for (int i = 0; i < lstTwo.size(); i++) {
        
            intArray[lstOne.size() + i] = lstTwo.get(i);
        }
        return intArray;       
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,1,1,0};
        System.out.println(applyOperationToAnArray.applyOperations(nums));
    }
}
