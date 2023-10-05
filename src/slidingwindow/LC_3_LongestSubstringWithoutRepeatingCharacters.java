package slidingwindow;

import java.util.LinkedHashSet;
import java.util.Set;

public class LC_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new LinkedHashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LC_3_LongestSubstringWithoutRepeatingCharacters lc = new LC_3_LongestSubstringWithoutRepeatingCharacters();
        String s = " ";
        System.out.println(lc.lengthOfLongestSubstring(s));
    }
}
