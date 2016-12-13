/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/reverse-string/
 */


public class Solution {
    public String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        for(int j=s.length()-1;j>=0;j--){
            res.append(Character.toString(s.charAt(j)));
        }
        return res.toString();
    }
}