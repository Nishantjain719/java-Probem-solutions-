// u have an array in which ith element is the price of a stock on day i.
// input: [7,1,5,3,6,4] output: 5
import java.util.*;
class Soultion14{
    public int maxProfit(int[] prices) {

        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i=0; i<prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            } else if (prices[i] - min_val > max_profit) {
                max_profit = prices[i] - min_val;
            }
        }
        return max_profit;
    }
}