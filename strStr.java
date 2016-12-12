/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/implement-strstr/
 */

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null)
            return -1;
        if(haystack.length()==0 && needle.length()==0)
            return 0;
        if(haystack.length()==0 && needle.length()>0)
            return -1;
        if(needle.length()==0 && haystack.length()>0)
            return 0;
        if(haystack.length()<needle.length())
            return -1;
        int index=-1;
        int needlePointer=0;
        for(int i=0;i<haystack.length();i++){
            if(needlePointer==0 && needle.charAt(0)==haystack.charAt(i)){
                index=i;
                ++needlePointer;
                if(needlePointer==needle.length())
                    return index;
            }
            else{
                if(needlePointer!=0 && needle.charAt(needlePointer)!=haystack.charAt(i))
                {
                    i=index;
                    index=-1;
                    needlePointer=0;
                    
                }
                if(needlePointer!=0 && needle.charAt(needlePointer)==haystack.charAt(i)){
                    ++needlePointer;
                    if(needlePointer==needle.length())
                        return index;
                }
            }
        }
        return -1;
    }
}