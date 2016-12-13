/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int st = nums[0];
        int ptr=1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==st) {
                continue;
            } else {
                st=nums[i];
                nums[ptr++]=st;
            }
        }
        return ptr;
    }
}