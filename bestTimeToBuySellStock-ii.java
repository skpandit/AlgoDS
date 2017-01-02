/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/best-time-to-buy-and-sell- stock-ii/
 */

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null)
            return 0;
        int low=prices[0];
        int high=prices[0];
        int maxSum=0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>prices[i-1])
            {
                high=prices[i];    
            } else {
                maxSum+=high-low;
                low=prices[i];
                high=prices[i];
            }
        }
        if(low!=high)
            maxSum+=high-low;
        return maxSum;
    }
}