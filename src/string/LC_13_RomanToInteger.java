package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
 *  I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class LC_13_RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        int number = 0;
        int previousNumber = 0;
        char previousC = '\u0000';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'V' || c == 'X') {
                if (previousC == 'I') {
                    if (c == 'V') {
                        number += 4;
                    } else {
                        number += 9;
                    }
                    number -= previousNumber;
                } else {
                    number += romanNums.get(c);
                }
            } else if (c == 'L' || c == 'C') {
                if (previousC == 'X') {
                    if (c == 'L') {
                        number += 40;
                    } else {
                        number += 90;
                    }
                    number -= previousNumber;
                } else {
                    number += romanNums.get(c);
                }
            } else if (c == 'D' || c == 'M') {
                if (previousC == 'C') {
                    if (c == 'D') {
                        number += 400;
                    } else {
                        number += 900;
                    }
                    number -= previousNumber;
                } else {
                    number += romanNums.get(c);
                }
            } else {
                number += romanNums.get(c);
            }
            previousC = c;
            previousNumber = romanNums.get(previousC);
        }
        return number;
    }

    public static void main(String[] args) {
        LC_13_RomanToInteger lc = new LC_13_RomanToInteger();
        String romanStr = "III";
        System.out.println(lc.romanToInt(romanStr));
        
        String romanStr2 = "LVIII";
        System.out.println(lc.romanToInt(romanStr2));
        
        String romanStr3 = "MCMXCIV";
        System.out.println(lc.romanToInt(romanStr3));
    }
}
