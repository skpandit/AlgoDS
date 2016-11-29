/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/product-of-array-except-self/
 */
 
 public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] arr1 = new int [len];
        int [] arr2 = new int [len];
        arr1[0]=1;
        arr2[len-1]=1;
        int k=0;
        for(int i=1;i<len;i++) {
            k=len-1-i;
            arr1[i]=arr1[i-1]*nums[i-1];
            arr2[k]=arr2[k+1]*nums[k+1];
        }
        for(int j=0;j<len;j++){
            arr2[j]*=arr1[j];
        }
        return arr2;
    }
}
