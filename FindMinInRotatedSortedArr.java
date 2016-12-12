/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */

public class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0 || nums==null)
            return -1;
        if(nums.length==1)
            return nums[0];
        
        return findMinHelper(nums, 0, nums.length-1);
    }
    public int findMinHelper(int[] nums, int start, int end) {
        while(start<end) {
            int middle = start + (end-start)/2;
            if(middle+1<nums.length && nums[middle]>nums[middle+1])
                return nums[middle+1];
            else if (nums[end]>nums[middle]) 
                end=middle;
            else
                start=middle+1;
            
        }
        return nums[0];
    }
}



