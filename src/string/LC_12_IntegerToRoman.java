package string;

public class LC_12_IntegerToRoman {
    public String intToRoman(int num) {
        int subtraction = num;
        StringBuilder builder = new StringBuilder();
        while(subtraction > 0) {
            if (subtraction >= 1000) {
                builder.append("M");
                subtraction -= 1000;
            } else if (subtraction >= 900) {
                builder.append("CM");
                subtraction -= 900;
            } else if (subtraction >= 500) {
                builder.append("D");
                subtraction -= 500;
            } else if (subtraction >= 400) {
                builder.append("CD");
                subtraction -= 400;
            } else if (subtraction >= 100) {
                builder.append("C");
                subtraction -= 100;
            } else if (subtraction >= 90) {
                builder.append("XC");
                subtraction -= 90;
            } else if (subtraction >= 50) {
                builder.append("L");
                subtraction -= 50;
            } else if (subtraction >= 40) {
                builder.append("XL");
                subtraction -= 40;
            } else if (subtraction >= 10) {
                builder.append("X");
                subtraction -= 10;
            } else if (subtraction >= 9) {
                builder.append("IX");
                subtraction -= 9;
            } else if (subtraction >= 5) {
                builder.append("V");
                subtraction -= 5;
            } else if (subtraction >= 4) {
                builder.append("IV");
                subtraction -= 4;
            } else if (subtraction >= 1) {
                builder.append("I");
                subtraction -= 1;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        LC_12_IntegerToRoman lc = new LC_12_IntegerToRoman();
        int num = 1994;
        System.out.println(lc.intToRoman(num));
    }
}
