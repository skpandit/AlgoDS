/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/palindrome-number/
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x/10 == 0)
            return true;
        //check for the highest power that can divide without giving zero
        int temp1=x;
        int temp2=x;
        int count=0;
        while(temp1/10 != 0){
            ++count;
            temp1=temp1/10;
        }
        int rem1=0;
        int rem2=0;
        for(int i=0; i<=count/2;i++){
            rem1=(int)(temp2/(Math.pow(10,(count-i))));
            rem2=x%10;
            if(rem1==rem2){
                temp2=(int)(temp2%(Math.pow(10,(count-i))));
                x=x/10;}
            else
                return false;
        }
        return true;
    }
}