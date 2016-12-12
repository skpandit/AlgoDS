/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/two-sum/
 */
 
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1=0;
        int index2=0;
        int [] res = new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    index1=i;
                    index2=j;
                }
            }
        }
        res[0]=index1+1;
        res[1]=index2+1;
        return res;
    }
}

