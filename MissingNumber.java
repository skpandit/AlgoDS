/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/missing-number/
 */
 
 public class Solution {
    public int missingNumber(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean isZero=false;
     for(int i=0; i<nums.length;i++){
         if(nums[i]==0)
            isZero=true;
         if(nums[i]>max)
            max=nums[i];
        sum+=nums[i];
     } 
     if(isZero == false)
        return 0;
     int total=(int)(max*(max+1)/2);
     if(sum == total)
        return (max+1);
     else
        return (total-sum);
    }
}
