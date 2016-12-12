/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/third-maximum-number/
 */
 
public class Solution {
    public int thirdMax(int[] nums) {
        if (nums==null || nums.length==0) 
            return 0;
        if(nums.length==2)
            return nums[1]>nums[0]?nums[1]:nums[0];
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>max1) {
               max2=max1;
               max1=nums[i];
           }
           if(nums[i]>max2 && nums[i]<max1)
                max2=nums[i];
        }
        if(max2 == Integer.MIN_VALUE)
            return max1;
        int max3=Integer.MIN_VALUE;
        boolean isModified = false;
        for(int j=0;j<nums.length;j++) {
            if(nums[j]<max2 && nums[j]>=max3) {
                max3=nums[j];isModified=true;
            }
        }
        if(isModified==true)
            return max3;
        else
            return max1;
    }
}
