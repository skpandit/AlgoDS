/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/sum-of-two-integers/
 */

public class Solution {
    public int getSum(int a, int b) {
        int carry = 1;
        while(carry!=0) {
            carry = a & b;
            a = a^b;
            b=carry<<1;
        }
        return a;
    }
}