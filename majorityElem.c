/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/majority-element/
 */

int majorityElement(int* nums, int numsSize) {
    int elem=nums[0];
    int count=0;
    for(int i=1;i<numsSize;i++){
        if(elem==nums[i]) count++;
        else {
            count--;
            if(count<0)
            {
                count=0;
                elem=nums[i];
            }
        }
    }
    return elem;
}