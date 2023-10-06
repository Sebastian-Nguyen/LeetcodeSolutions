package array;

// in-place algorithm -> operates directly on the input data structure without requiring extra space proportional to the input size.
public class LC_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        LC_27_RemoveElement lc = new LC_27_RemoveElement();
        int[] nums = new int[] { 3,2,2,3 };
        int val = 3;
        System.out.println(lc.removeElement(nums, val));
    }
}
