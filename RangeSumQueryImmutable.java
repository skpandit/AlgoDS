/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
 
public class NumArray {
    static int [] arr;
    static int [] sumArr;
    public NumArray(int[] nums) {
        arr=nums;
        sumArr = new int [nums.length];
        if(sumArr.length>0) {
            sumArr[0]=arr[0];
            for(int i=1;i<nums.length;i++){
                sumArr[i]=sumArr[i-1]+arr[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i==0)
            return sumArr[j];
        else
            return sumArr[j]-sumArr[i]+arr[i];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
