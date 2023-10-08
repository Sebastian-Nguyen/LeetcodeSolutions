package string;

public class LC_58_LengthOfLastWord {
//    public int lengthOfLastWord(String s) {
//        String[] tokens = s.trim().split(" ");
//        return tokens[tokens.length - 1].length();
//    }
//    
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int word = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            word += 1;
            i--;
        }
        return word;
    }

    public static void main(String[] args) {
        LC_58_LengthOfLastWord lc = new LC_58_LengthOfLastWord();
        String s = "Hello World";
        System.out.println(lc.lengthOfLastWord(s));
    }
}
