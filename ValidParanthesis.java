/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/valid-parentheses/
 */

public class Solution {
    public boolean isValid(String s) {
        String roundS = "(";
        String roundE = ")";
        String curlyS = "{";
        String curlyE = "}";
        String squareS = "[";
        String squareE = "]";
        String start = "({[";
        String end = ")}]";
        boolean flag = true;
        Stack <String> st = new Stack<String>();
        for(int i = 0;i<s.length();i++){
            String substr = s.substring(i,i+1);
            if(start.contains(substr))
                st.push(substr);
            else
            {
                if(st.isEmpty()) return false;
                String temp = st.pop();
                if(substr.contains(roundE))
                { if(!temp.contains(roundS)) return false;}
                if(substr.contains(curlyE))
                { if(!temp.contains(curlyS)) return false;}
                if(substr.contains(squareE))
                { if(!temp.contains(squareS)) return false;}
            }
        }
        if(!st.isEmpty())
            return false;
        return flag;
    }
}