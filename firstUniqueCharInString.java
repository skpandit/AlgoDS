/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/first-unique-character-in-a-   string/
 */

public class Solution {
    public int firstUniqChar(String s) {
        int [] map = new int[26];
        for(int i=0;i<26;i++)
            map[i]=-1;
        int result=-1;
        for(int j=0;j<s.length();j++){
            int temp = s.charAt(j)-'a';
            if(map[temp]==-1)
                map[temp]=j;
            else {
                map[temp]=-2;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int u=0;u<26;u++)
        {
            if(map[u]>=0)
            {
                if(min>map[u])
                    min=map[u];
            }
        }
        if(min == Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }
}