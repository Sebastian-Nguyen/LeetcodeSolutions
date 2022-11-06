package array;

/**
 * https://leetcode.com/problems/steps-to-make-array-non-decreasing/.
 * <p>
 * The main idea is loop through the input array and count the steps for an element to be removed.
 * Recursion is not good due to time and memory consumption, use dynamic programming instead.
 * <p>
 * This solution uses two arrays: <b>stepsCountArr</b> to store steps that need to remove an element 
 * and <b>greaterNumberArr</b> to store the index of the nearest greater element to the left if the current one is removed.
 * <p>
 * For example:
 * <pre>
 * [7, 14, 4, 14, 13, 2, 6, 13] -> nums
 *  0  1   2   3   4  5  6  7   -> indices
 *  0  0   1   0   1  1  2  3   -> stepsCountArr
 * -1 -1   1  -1   3  4  4  4   -> greaterNumberArr
 * </pre>
 * <p>
 * Explanation:
 * <pre>
 * currentIndex = 0, always a keeper, number of steps to be remove = 0, greater element to the left = -1 (value -1 is to indicate the element is a keeper)
 * currentIndex = 1, nums[0] < nums[1], is a keeper, number of steps to be remove = 0, greater element to the left = -1
 * currentIndex = 2, nums[1] > nums[2], number of steps to be remove = 1, greater element to the left = 1
 * currentIndex = 3, nums[2] < nums[3], if this element removed, it will be removed after nums[2] (stepsCountArr[2] = 1 -> stepsCountArr[3] = 2),
 *                                      then it needs to be compare with the nearest greater element to the left of nums2 (greaterNumberArr[2] = 1)
 *                                      if the greater element is a keeper and value (nums[1]) is less than or equal to the current element, the current element is a keeper too
 *                                      if the greater element is not a keeper and value (nums[1]) is greater than the current element, the current element will be removed, set greaterNumberArr of this current element to the greater index
 *                                      if the greater element is not a keeper and value is less than or equal to the current element, 
 *                                          if (stepsCountArr of greater element + 1) greater than (stepsCountArr of current element), set stepsCountArr of current element to stepsCountArr of greater element + 1 
 *                                          go on with the greater element of the greater element
 * ...
 * The steps to make array non-decreasing is the max number of steps in stepsCountArr 
 * </pre>
 * 
 * @author trungnb
 *
 */
public class LC_2289_StepToMakeArrayNonDecreasing {
    private final static int KEEPER = -1;
    int [] stepsCountArr;
    int [] greaterNumberArr;
    public int totalSteps(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        } else {
            int max = 0;
            stepsCountArr = new int[nums.length];
            greaterNumberArr = new int[nums.length];

            stepsCountArr[0] = 0;
            greaterNumberArr[0] = KEEPER;
            for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
                if (nums[currentIndex - 1] > nums[currentIndex]) {
                    stepsCountArr[currentIndex] = 1;
                    greaterNumberArr[currentIndex] = currentIndex - 1;
                } else {
                    stepsCountArr[currentIndex] = 0;
                    //
                    int prev = currentIndex - 1;
                    while (greaterNumberArr[prev] != KEEPER && nums[prev] <= nums[currentIndex]) {
                        if (stepsCountArr[prev] + 1 > stepsCountArr[currentIndex]) {
                            stepsCountArr[currentIndex] = stepsCountArr[prev] + 1;
                        }
                        prev = greaterNumberArr[prev];
                    }
                    if (greaterNumberArr[prev] != KEEPER) { // (greaterNumberArr[prev] != KEEPER && nums[currentIndex] > nums[prev])
                        greaterNumberArr[currentIndex] = prev;
                    } else { // greaterNumberArr[prev] == KEEPER
                        if (nums[currentIndex] < nums[prev]) {
                            greaterNumberArr[currentIndex] = prev;
                        } else {
                            stepsCountArr[currentIndex] = 0;
                            greaterNumberArr[currentIndex] = KEEPER;
                        }
                    }
                    //
                }
                max = stepsCountArr[currentIndex] > max ? stepsCountArr[currentIndex] : max;
            }
            return max;
        }
    }

//    public static void main(String[] args) {
//        LC_2289_Solution solution = new LC_2289_Solution();
//        int[] nums1 = {5,3,4,4,7,3,6,11,8,5,11};
//        int[] nums2 = {4,5,7,7,13};
//        int[] nums3 = {10,1,2,3,4,5,6,1,2,3};
//        int[] nums4 = {7,14,4,14,13,2,6,13};
//        int totalSteps1 = solution.totalSteps(nums1);
//        System.out.println(totalSteps1);
//        int totalSteps2 = solution.totalSteps(nums2);
//        System.out.println(totalSteps2);
//        int totalSteps3 = solution.totalSteps(nums3);
//        System.out.println(totalSteps3);
//        int totalSteps4 = solution.totalSteps(nums4);
//        System.out.println(totalSteps4);
//    }
}
