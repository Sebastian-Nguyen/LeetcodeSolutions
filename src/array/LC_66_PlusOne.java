package array;

import java.util.Arrays;

public class LC_66_PlusOne {
    public int[] plusOne(int[] digits) {
        int r = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + r == 10) {
                digits[i] = 0;
                r = 1;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        if (r == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) {
                result[j] = 0;
            }
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        LC_66_PlusOne lc = new LC_66_PlusOne();
        int[] nums = new int[] {4,3,2,1};
        int[] result = lc.plusOne(nums);
        System.out.println(Arrays.toString(result));
    }
}
