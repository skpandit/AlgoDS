/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/ransom-note/
 */

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))) {
                int val = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i),val+1);
            } else {
                map.put(magazine.charAt(i),1);
            }
        }
        boolean result = true;
        for(int j=0;j<ransomNote.length();j++){
            if(map.containsKey(ransomNote.charAt(j))) {
                int limit=map.get(ransomNote.charAt(j));
                if(limit<=0)
                {
                    result=false;
                    break;
                } else {
                    map.put(ransomNote.charAt(j),limit-1);
                }
            } else {
                result=false;
                break;
            }
        }
        return result;
    }
}