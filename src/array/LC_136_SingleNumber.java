package array;

public class LC_136_SingleNumber {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        if (nums.length > 1) {
            for(int i = 1; i < nums.length; i++) {
                singleNumber ^= nums[i];
            }
        }
        return singleNumber;
    }
    public static void main(String[] args) {
        LC_136_SingleNumber lc = new LC_136_SingleNumber();
        int[] nums = new int[] {2, 1, 2};
        System.out.println(lc.singleNumber(nums));
    }
}
