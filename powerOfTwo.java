/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/power-of-two/
 */

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if( (n & (n-1)) == 0)
            return true;
        else
            return false;
    }
}