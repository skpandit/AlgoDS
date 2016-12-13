/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/longest-palindrome/
 */

public class Solution {
    public int longestPalindrome(String s) {
        int [] arr = new int [256];
        for(int i=0;i<s.length();i++) {
            int temp = s.charAt(i);
            arr[temp] ++;
        }
        boolean oneVar = false;
        int count = 0;
        boolean isOdd = false;
        for(int j=0;j<256;j++) {
            if(arr[j]==1 && oneVar == false) {
                count+=1;
                oneVar=true;
            }
            else if(arr[j]%2!=0) {
                count+=arr[j]-1; isOdd=true;
            } else
                count+=arr[j];
        }
        if(oneVar == false) {
            if(isOdd==true)
                count+=1;
        }
        return count;
    }
}
