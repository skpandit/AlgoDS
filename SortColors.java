/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/sort-colors/
 */
 
 public class Solution {
    public void sortColors(int[] nums) {
        int redCount=0;
        int whiteCount=0;
        int blueCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                redCount++;
            else if(nums[i]==1)
                whiteCount++;
            else
                blueCount++;
        }
        for(int j=count;j<nums.length;j++){
            if(redCount>0) {
                nums[j]=0; redCount--;
            }
            else if(whiteCount>0){
                nums[j]=1; whiteCount--;
            }
            else if(blueCount>0)
            {
                nums[j]=2; blueCount--;
            }
        }
    }
}
