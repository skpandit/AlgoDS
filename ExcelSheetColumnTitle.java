/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/excel-sheet-column-title/
 */

public class Solution {
    public String convertToTitle(int n) {
        String ans="";
        if(n==0)
            return ans;
        char temp =' ';
        while(n>0) {
            if(n%26 == 0) {
                temp = (char)(64 + 26); n=(n/26) -1;
            } else {
                temp = (char)(64 + (n%26));
                n=n/26;
            }
            ans+=Character.toString(temp);
        }
        char [] arr = ans.toCharArray();
        for(int i=0;i<arr.length/2;i++) {
            char t = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }
        return String.valueOf(arr);
    }
}