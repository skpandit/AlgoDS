/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
 
 public class Solution {
    public String reverseWords(String s) {
       char [] arr = s.toCharArray();
        LinkedList <String> list = new LinkedList<String>();
        String word="";
        //count number of words
        for(int i=0; i<s.length();i++){
            if(arr[i]==' ')
                continue;
            else{
                while(i<s.length() && arr[i]!=' '){
                    word+=arr[i];
                    i++;
                }
                list.add(word);
                word="";
            }
            
        }
        String result="";
        for(int j=list.size()-1; j>=0;j--){
            result+=list.get(j);
            if(list.size() > 1 && j!=0)
            result+=" ";
        }
        return result;
    }
}
