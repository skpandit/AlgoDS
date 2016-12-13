/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/roman-to-integer/
 */

public class Solution {
    public int romanToInt(String s) {
        if(s.length()==0)
            return 0;
        HashMap <String,Integer> m = new HashMap<String,Integer>();
        m.put("I",1);
        m.put("V",5);
        m.put("X",10);
        m.put("L",50);
        m.put("C",100);
        m.put("D",500);
        m.put("M",1000);
        int prev = m.get(s.substring(s.length()-1,s.length()));
        int ans = prev;
        for(int i=s.length()-2;i>=0;i--){
            int temp = m.get(s.substring(i,i+1));
            if(temp<prev)
                ans-=temp;
            else
                ans+=temp;
            prev=temp;
        }
        return ans;
    }
}