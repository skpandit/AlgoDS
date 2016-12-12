/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
 
public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length==0 || nums==null)
            return -1;
        if(nums.length==1) {
            if(nums[0]==target)
                return 0;
            else 
                return -1;
        }
        int pivot = findPivotIndex(nums);
        System.out.println(pivot);
        int end=nums.length-1;
        int start=0;
        if(nums[pivot]==target)
            return pivot;
        else if(nums[end]<target) {
            end=pivot-1;
        } else
            start=pivot+1;
        while(start<=end) 
        {
            int middle=start+(end-start)/2;
            if(nums[middle]==target)
                return middle;
            else if (nums[middle]>target)
                end=middle-1;
            else
                start=middle+1;
        }
        return -1;
    }
    public int findPivotIndex(int [] nums) {
        int start=0;
        int end = nums.length-1;
        while(start<=end) {
            int middle=start+(end-start)/2;
            if(middle+1<nums.length && nums[middle]>nums[middle+1]) {
                return middle;
            }
            else if(nums[end]>nums[middle])
                end=middle;
            else
                start=middle+1;
        }
        return 0;
    }
    
}
