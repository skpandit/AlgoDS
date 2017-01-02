/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/coin-change/
 */

public class Solution {
    public int coinChange(int[] coins, int amount) {
     if(coins.length==0 || coins==null) 
        return -1;
     if(amount==0)
        return 0;
     int [] arr = new int [amount+1];
     arr[0]=0;
     for(int i=1;i<arr.length;i++)
        arr[i]=Integer.MAX_VALUE-1;
     for(int c: coins) {
        for(int i=1;i<=amount;i++) {
            if(c<i) {
                int temp = i - c;
                if(arr[temp]+1 <arr[i])
                    arr[i]=arr[temp]+1;
            
            } else if (c==i)
                arr[i]=1;
        }
     }
     return arr[amount]==Integer.MAX_VALUE-1?-1:arr[amount];
    }
}