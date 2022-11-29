package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Link to the problem on LeetCode.</a>
 * 
 * The problem is solved by using a map to store & search
 * @author trungnb
 *
 */
public class LC_1_TwoSum {
    private Map<Integer, Integer> map = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            Integer numInMap = map.get(nums[i]);
            if (numInMap != null) {
                return new int[] {i, numInMap};
            }
            int sub = target - nums[i];
            map.put(sub, i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        LC_1_TwoSum lc = new LC_1_TwoSum();
        
        int[] nums1 = new int[] {2, 7, 11, 15};
        int[] result1 = lc.twoSum(nums1, 9);
        
        int[] nums2 = new int[] {3, 2, 4};
        int[] result2 = lc.twoSum(nums2, 6);
        
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
