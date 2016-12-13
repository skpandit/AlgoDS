/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/find-the-difference/
 */

public class Solution {
    public char findTheDifference(String s, String t) {
     int [] map = new int [26];
     for(int i=0;i<s.length();i++)
     {
         int index1=s.charAt(i)-'a';
         map[index1]++;
     }
     char result=' ';
     for(int j=0;j<t.length();j++) {
         int index2=t.charAt(j)-'a';
         if(map[index2]>0)
            map[index2]--;
        else {
            result=t.charAt(j);
            break;
        }
     }
     return result;
    }
}