package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_383_RansomNote {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < magazine.length(); i++) {
//            if (map.get(magazine.charAt(i)) != null) {
//                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
//            } else {
//                map.put(magazine.charAt(i), 1);
//            }
//        }
//        for (int j = 0; j < ransomNote.length(); j++) {
//            if (map.get(ransomNote.charAt(j)) != null) {
//                int count = map.get(ransomNote.charAt(j)) - 1;
//                if (count < 0) {
//                    return false;
//                } else {
//                    map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j)) - 1);
//                }
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[26];
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (char c: magazine.toCharArray()) {
            counter[c - 'a']++;
        }
        for (char c: ransomNote.toCharArray()) {
            if (counter[c - 'a'] == 0) {
                return false;
            } else {
                counter[c - 'a']--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LC_383_RansomNote lc = new LC_383_RansomNote();
        String ransomeNote = "aa";
        String magazine = "ab";
        System.out.println(lc.canConstruct(ransomeNote, magazine));
    }
}
