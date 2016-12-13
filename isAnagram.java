/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/valid-anagram/
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        int [] anagram = new int [26];
        for(int i=0; i<s.length();i++){
            ++anagram[(s.charAt(i))-'a'];
        }
        for(int j=0; j<t.length();j++){
            --anagram[(t.charAt(j))-'a'];
            if(anagram[(t.charAt(j))-'a']<0)
            {
                return false;
            }
        }
        for(int k=0; k<26;k++){
            if(anagram[k]!=0)
                return false;
        }
        return true;
    }
}