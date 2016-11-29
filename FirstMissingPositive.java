/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/first-missing-positive/ 
 */
 
 public class Solution {
    public int firstMissingPositive(int[] nums) {
       if(nums.length==0)
            return 1;
       for(int i=0;i<nums.length;i++) {
            if(nums[i]<=0)
                nums[i]=nums.length+1 ;
            
       }
       for(int i=0;i<nums.length;i++) {
           if (nums[i] > nums.length)
                continue;
           else {
                if(Math.abs(nums[i]) <= nums.length && nums[Math.abs(nums[i])-1]>0)
                    nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
           }
       }
       int ans=0;
       for(int i=0;i<nums.length;i++) {
           System.out.println(nums[i]);
           if(nums[i]>0) {
            ans=i+1; break;}
       }
       if(ans==0)
        return nums.length+1;
       return ans;
    }
}
