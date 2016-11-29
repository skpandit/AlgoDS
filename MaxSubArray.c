/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/maximum-subarray/
 */
 
#include <limits.h>
int maxSubArray(int* nums, int numsSize) {
   int maxSum=0;
   int contSum=0;
   int maxElem=INT_MIN;
   for(int i=0;i<numsSize;i++){
       if(nums[i]+contSum < 0)
        contSum=0;
       else
        contSum+=nums[i];
       if(maxSum <contSum)
        maxSum=contSum;
    if(nums[i]>maxElem)
        maxElem=nums[i];
   }
   if(maxSum==0){
        maxSum=maxElem;
   }
    return maxSum;
}
