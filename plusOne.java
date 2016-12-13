/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/plus-one/
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        int [] ans = new int [digits.length+1];
        int carry=1;
        int temp=0;
        for(int j=digits.length-1;j>=0;j--){
            temp=(digits[j]+carry)%10;
            carry=(digits[j]+carry)/10;
            ans[j+1]=temp;
        }
        if(carry==1)
            ans[0]=1;
        if(ans[0]==0){
            int [] ans2 = new int [digits.length];
            for(int i=0;i<ans.length-1;i++)
                ans2[i]=ans[i+1];
            return ans2;
        }
        return ans;
    }
}