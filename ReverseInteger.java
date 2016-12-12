/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/reverse-integer/
 */

public class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if(x<10 && x>-10)
            return x;
        int end =0;
        if(x<0)
        {    
            isNeg=true;
            end=1;
        }
        String s = Integer.toString(x);
        String temp="";
        for(int i=s.length()-1;i>=end;i--){
            temp+=s.charAt(i);
        }
        long s2 = Long.parseLong(temp);
        if(s2>(Math.pow(2,31)-1))
            return 0;
        else
        {int s1 = Integer.parseInt(temp);
        if(isNeg)
            return (-1*s1);
        else
            return s1;
        }
    }
}
