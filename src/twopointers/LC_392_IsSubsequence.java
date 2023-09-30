package twopointers;

public class LC_392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        LC_392_IsSubsequence lc = new LC_392_IsSubsequence();
        String s = "b";
        String t = "abc";
        System.out.println(lc.isSubsequence(s, t));
    }
}
