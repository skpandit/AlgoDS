/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/find-peak-element/
 */
 
public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==0 || nums==null)
            return 0;
        if(nums.length==1)
            return 0;
        return findPeakHelper(nums,0,nums.length-1);
    }
    public int findPeakHelper(int [] nums, int start, int end) {
        int middle = start+(end-start)/2;
        if(middle-1>=0 && middle+1<nums.length){
            if(nums[middle-1]<nums[middle] && nums[middle+1]<nums[middle])
                return middle;
            else if (nums[middle-1]>nums[middle])
                return findPeakHelper(nums,start,middle-1);
            else
                return findPeakHelper(nums,middle+1,end);
            
        } else if (middle==0) {
            if(nums[middle+1]<nums[middle])
                return middle;
            return middle+1;
        } else {
            if(nums[middle-1]<nums[middle])
                return middle;
            return middle-1;
        }
       // return -1;
    }
    
}
