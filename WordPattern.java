/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/word-pattern/
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length()==0)
        {
            if(str.length()!=0)
                return false;
            else
                return true;
        } 
        if(str.length()==0){
            if(pattern.length()!=0)
                return false;
            else
                return true;
        }
        String [] split = str.split(" ");
        if(pattern.length()!=split.length)
            return false;
        String [] map = new String[26];
        String append ="";
        int temp=0;
        for(int i=0;i<pattern.length();i++){
            temp=(int)(pattern.charAt(i)-'a');
            if(map[temp]!=null)
            {    if(!map[temp].equals(split[i]))
                    return false;
            } else {
                if(append.contains(split[i]))
                    return false;
                else{
                    map[temp]=split[i];
                    append=append+split[i]+" ";
                }
            }
            
        }
        return true;
    }
}
