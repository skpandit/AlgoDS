/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/move-zeroes/
 */

public class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=1; i<nums.length;i++){
            j=i-1;
            while(j>=0 && nums[j]==0){
                    --j;
            }
            int temp=0;
            if(nums[i]!=0){
                temp=nums[j+1];
                nums[j+1]=nums[i];
                nums[i]=temp;
            }
        }
    }
}