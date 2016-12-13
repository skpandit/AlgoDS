/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */

public class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==0|| nums==null)
            return 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) 
            min=nums[i]<min?nums[i]:min;
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        return sum-(nums.length*min);
    }
}