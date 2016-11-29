/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
 
 public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0)
            return -1;
        Arrays.sort(nums);
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp)
                return nums[i];
            temp=nums[i];
        }
        return -1;
    }
}
