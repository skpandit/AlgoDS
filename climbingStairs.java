/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/climbing-stairs/
 */

public class Solution {
    public int climbStairs(int n) {
        if(n==0)
            return -1;
        int [] res = new int [n];
        res[0]=1;
        if(n>1)
            res[1]=2;
        for(int i=2; i<res.length; i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res[n-1];
    }
}