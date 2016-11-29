/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/longest-increasing-subsequence/
 */
 
 public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int [] T = new int [nums.length];
        for(int g=0;g<T.length;g++)
            T[g]=1;
        int i = 1;
        int j =0;
        while(i<nums.length){
            while(j<i){
                if(nums[j]<nums[i])
                    T[i]=T[i]>(T[j]+1)?T[i]:(T[j]+1);
                j++;
            }
            j=0;
            i++;
        }
        int max=Integer.MIN_VALUE;
        for(int h=0;h<nums.length;h++){
            if(T[h]>max)
                max=T[h];
        }
        return max;
    }
}
