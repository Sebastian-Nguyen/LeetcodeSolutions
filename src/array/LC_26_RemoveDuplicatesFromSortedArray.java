package array;

import java.util.Arrays;

public class LC_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
    
    public static void main(String[] args) {
        LC_26_RemoveDuplicatesFromSortedArray lc = new LC_26_RemoveDuplicatesFromSortedArray();
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int k = lc.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
