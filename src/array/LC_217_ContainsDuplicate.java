package array;

import java.util.HashMap;
import java.util.Map;

public class LC_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            if (map.containsKey(n)) {
                return true;
            } else {
                map.put(n, n);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LC_217_ContainsDuplicate lc = new LC_217_ContainsDuplicate();
        int[] nums = new int[] {1,2,3,1};
        System.out.println(lc.containsDuplicate(nums));
    }
}
