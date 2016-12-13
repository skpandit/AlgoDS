/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
       int profit=Integer.MIN_VALUE;
       int minElem=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
           if(prices[i]<minElem)
            minElem=prices[i];
           if(prices[i]-minElem>profit)
            profit=prices[i]-minElem;
       }
       return profit;
    }
}