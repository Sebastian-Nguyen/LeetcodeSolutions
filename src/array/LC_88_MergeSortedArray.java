package array;

import java.util.Arrays;

public class LC_88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k >= 0) {
            if (i < 0 && j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            if (i >= 0 && j < 0) {
                return;
            }
            if (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                } else if (nums1[i] < nums2[j]) {
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                } else {
                    nums1[k] = nums1[i];
                    nums1[k-1] = nums2[j];
                    i--;
                    j--;
                    k -= 2;
                }
            }
        }
    }

    public static void main(String[] args) {
        LC_88_MergeSortedArray lc = new LC_88_MergeSortedArray();
        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {1};
        lc.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}
