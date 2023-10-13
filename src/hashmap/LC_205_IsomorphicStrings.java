package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if (map.containsValue(t.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LC_205_IsomorphicStrings lc = new LC_205_IsomorphicStrings();
        String s = "paper";
        String t = "title";
        System.out.println(lc.isIsomorphic(s, t));
    }
}
