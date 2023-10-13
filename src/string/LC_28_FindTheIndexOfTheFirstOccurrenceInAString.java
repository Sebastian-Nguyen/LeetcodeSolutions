package string;

public class LC_28_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        LC_28_FindTheIndexOfTheFirstOccurrenceInAString lc = new LC_28_FindTheIndexOfTheFirstOccurrenceInAString();
        String haystack = "mississippi", needle = "issip";
        System.out.println(lc.strStr(haystack, needle));
    }
}
