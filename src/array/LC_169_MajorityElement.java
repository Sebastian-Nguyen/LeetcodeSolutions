package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_169_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
            }
            map.put(nums[i], count + 1);
            if (max < count + 1) {
                max = count + 1;
                if (max > nums.length/2) {
                    return nums[i];
                }
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        LC_169_MajorityElement lc = new LC_169_MajorityElement();
        int[] nums = new int[] {2,2,1,1,1,2,2};
        int found = lc.majorityElement(nums);
        System.out.println(found);
    }
}
