package twopointers;

public class LC_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if ("".equals(s.trim())) {
            return true;
        }
        String lowercaseS = s.toLowerCase();
        int i = 0;
        int j = lowercaseS.length() - 1;
        while(i != j && i < j) {
            char ci = lowercaseS.charAt(i);
            char cj = lowercaseS.charAt(j);
            if (isLetterOrDigit(ci) && isLetterOrDigit(cj)) {
                if (ci == cj) {
                    i++; j--;
                } else {
                    return false;
                }
            }
            if (!isLetterOrDigit(ci)) {
                i++;
            }
            if (!isLetterOrDigit(cj)) {
                j--;
            }
        }
        return true;
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        LC_125_ValidPalindrome validPalindrome = new LC_125_ValidPalindrome();
        String test1 = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(test1));
    }
}
