/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/add-strings/
 */

public class Solution {
    public String addStrings(String num1, String num2) {
        if(num1==null || num1.length() == 0)
            return num2;
        else if (num2==null || num2.length() == 0)
            return num1;
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry=0;
        String res="";
        int re = 0;
        while(i>=0 || j>=0) {
            if(i>=0) 
            {    re += num1.charAt(i) - '0'; i--; }
            if(j>=0)
            {    re += num2.charAt(j) - '0'; j--; }
            re += carry;
            carry = re/10;
            char temp = (char) ((re%10)+48);
            res+=String.valueOf(temp);
            re=0;
        }
        if(carry!=0)
            res+='1';
        char [] arr = res.toCharArray();
        for(int k=0;k<arr.length/2;k++) {
            char t = arr[k];
            arr[k]=arr[arr.length-1-k];
            arr[arr.length-1-k] = t;
        }
        return String.valueOf(arr);
    }
}
