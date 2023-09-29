package array;

import java.util.ArrayList;
import java.util.List;

public class LC_118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        Integer[] temp = new Integer[numRows];
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = i-1; j >= 0; j--) {
                if (j == i-1 || j == 0) {
                    row.add(1);
                    temp[j] = 1;
                } else {
                    row.add(temp[j] + temp[j-1]);
                    temp[j] = temp[j] + temp[j-1];
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        LC_118_PascalsTriangle lc = new LC_118_PascalsTriangle();
        System.out.println(lc.generate(5));
    }
}
