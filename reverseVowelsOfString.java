/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */

public class Solution {
    public String reverseVowels(String s) {
        if(s.length()<2)
            return s;
        String vowels = "aeiouAEIOU";
        int i =0;
        int j = s.length()-1;
        char [] arr = s.toCharArray();
        while(i<j) {
            if(vowels.contains(Character.toString(arr[i])))
            {
                if(vowels.contains(Character.toString(arr[j]))){
                    //swap
                    char temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                } else 
                    j--;
            } else 
                i++;
        }
        return String.valueOf(arr);
    }
}