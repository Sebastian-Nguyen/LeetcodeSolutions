package array;

public class LC_80_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (i + 1 < nums.length && i + 2 < nums.length && nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                i++;
            } else if (i != j) {
                nums[j] = nums[i];
                i++; j++;
            } else {
                i++; j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,2,2,3};
        LC_80_RemoveDuplicatesFromSortedArrayII lc = new LC_80_RemoveDuplicatesFromSortedArrayII();
        System.out.println(lc.removeDuplicates(nums));
    }
}
