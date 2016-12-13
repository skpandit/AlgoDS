/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/assign-cookies/
 */

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        if(g == null || g.length == 0 || s == null || s.length == 0)
            return count;
        Arrays.sort(g);
        Arrays.sort(s);
        int index=0;
        for(int i=0;i<s.length;i++){
            if(index < g.length && s[i]>=g[index]) {
                count++;index++;
            } 
        }
        return count;
    }
}