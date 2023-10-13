package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(words[i]) != null) {
                if (map.get(words[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                if (map.containsValue(pattern.charAt(i))) {
                    return false;
                }
                map.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LC_290_WordPattern lc = new LC_290_WordPattern();
        String pattern = "abba", s = "dog cat cat fish";
        System.out.println(lc.wordPattern(pattern, s));
    }
}
