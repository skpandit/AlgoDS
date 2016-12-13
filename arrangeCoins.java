/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/arranging-coins/
 */

public class Solution {
    public int arrangeCoins(int n) {
        if(n<=1)
            return n;
        int i=2;
        n--;
        while(true) {
            n=n-i;
            if(n<0)
                break;
            i++;
        }
        return i-1;
    }
}