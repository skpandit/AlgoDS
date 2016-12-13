/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/remove-element/
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        if (nums.length==1) {
            if(val == nums[0])
                return 0;
            else 
                return 1;
        }
        int pos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val)
                nums[pos++]=nums[i];
        }
        return pos;
    }
}