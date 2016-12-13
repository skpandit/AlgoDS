/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/house-robber/
 */

public class Solution {
    public int rob(int[] nums) {
     if(nums.length==0)
        return 0;
     if(nums.length==1)
         return nums[0];
     if(nums.length==2)
        return nums[0]>nums[1]?nums[0]:nums[1];
     int [] res = new int [nums.length];
     int i=0;
     int temp1=0;
     int temp2=0;
     while(i<nums.length){
         temp1=((i-2)<0?res[i]:res[i-2])+nums[i];
         temp2=((i-3)<0?res[i]:res[i-3])+nums[i];
         res[i]=temp1<temp2?temp2:temp1;
         ++i;
     }
     return res[nums.length-1]>res[nums.length-2]?res[nums.length-1]:res[nums.length-2];
    }
}