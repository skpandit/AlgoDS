/**
 * Date 04/24/2016
 * @author Tushar Roy
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
 
 public class Solution {
    public int bSearch(int [] numbers,int start, int end, int num2) {
        int index=-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(numbers[mid]==num2)
                index=mid;
            else if (numbers[mid]>num2)
                end=mid-1;
            else
                start=mid+1;
        }
        return index;
    }
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int [] indexArr = new int[2];
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                indexArr[0]=start+1;
                indexArr[1]=end+1;
                break;
            } else {
                if(numbers[start]+numbers[end]>target)
                    end--;
                else
                    start++;
            }
        } 
        return indexArr;
    }
}
