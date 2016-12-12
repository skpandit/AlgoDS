/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/rotate-array/
 */

public class Solution {
    public void rotate(int[] nums, int k) {
        int rot = k%nums.length;
        if(k<=0 || nums.length<=1)
            return;
        int [] arr = new int [rot]; 
        for(int j=0;j<arr.length;j++) {
            arr[j]=nums[nums.length-rot+j];
        }
        for(int i=nums.length-rot-1;i>=0;i--) {
            nums[i+rot] = nums[i]; 
        }
        for(int l=0;l<rot;l++){
            nums[l]=arr[l];
        }
    }
}
