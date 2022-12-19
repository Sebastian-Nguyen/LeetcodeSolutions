package array;

public class LC_121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profitMax = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                int profit = prices[i] - min;
                if (profitMax < profit) {
                    profitMax = profit;
                }
            }
        }
        return profitMax;
    }
    public static void main(String[] args) {
        LC_121_BestTimeToBuyAndSellStock lc = new LC_121_BestTimeToBuyAndSellStock();
        int[] prices = new int[]{7,1,5,3,6,4};
        int max = lc.maxProfit(prices);
        System.out.println(max);
    }
}
