package slidingwindow;

public class LC_209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }

    public static void main(String[] args) {
        LC_209_Minimum_Size_Subarray_Sum lc = new LC_209_Minimum_Size_Subarray_Sum();
        int min = lc.minSubArrayLen(7, new int[] {2,3,1,2,4,3});
        System.out.println(min);
    }
}
