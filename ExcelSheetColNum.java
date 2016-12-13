/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/excel-sheet-column-number/
 */

public class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            int offset = s.charAt(s.length()-i-1)-'A'+1;
            if(i==0)
                ans+=offset;
            else
                ans+=(Math.pow(26,i)*offset);
        }
        return ans;
    }
}