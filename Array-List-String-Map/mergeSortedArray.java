import java.util.Arrays;
class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[] {};
        if(nums1.length!=(m+n)) return result;
        for (int j=0; j<n; j++){
            nums1[j+m]=nums2[j];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0}; 
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;
        System.out.println(MergeSortedArray.merge(nums1, m, nums2, n));
    }
}