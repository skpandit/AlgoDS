/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/single-number/
 */

public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length;i++)
        {
            result^=nums[i];
        }
        return result;
    }
}