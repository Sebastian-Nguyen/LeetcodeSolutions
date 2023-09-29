package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LC_350_IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i: nums1) {
            if (map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        for (int j: nums2) {
            if (map2.containsKey(j)) {
                map2.put(j, map2.get(j) + 1);
            } else {
                map2.put(j, 1);
            }
        }
        for (Entry<Integer, Integer> entry1: map1.entrySet()) {
            if (map2.containsKey(entry1.getKey())) {
                int count1 = entry1.getValue();
                int count2 = map2.get(entry1.getKey());
                int min = count1 <= count2 ? count1 : count2;
                for (int i = 0; i < min; i++) {
                    list.add(entry1.getKey());
                }
            }
        }
        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) array[i] = list.get(i);
        return array;
    }
    public static void main(String[] args) {
        LC_350_IntersectionOfTwoArrays lc = new LC_350_IntersectionOfTwoArrays();
        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[] {9,4,9,8,4};
        int[] intersectionArr = lc.intersect(nums1, nums2);
        Arrays.stream(intersectionArr).forEach(System.out::println);
    }
}
