/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/add-binary/
 */
 
public class Solution {
    public String addBinary(String a, String b) {
       int ptr1=a.length()-1;
       int ptr2=b.length()-1;
       String result="";
       int carry =0;
       int n1=0;
       int n2=0;
       while(ptr1>=0 || ptr2>=0) {
           int res=0;
           if(ptr1>=0){
               n1=a.charAt(ptr1)-'0';
           } else
               n1=0;
           if(ptr2>=0) {
               n2=b.charAt(ptr2)-'0';
           } else
               n2=0;
           res=n1+n2+carry;
           if(res==3)
           {     
               result+="1";
               carry=1;
           }
           else if(res==2) {
               result+="0";
               carry=1;
           }
           else {
               result+=(res==1?"1":"0");
               carry=0;
           }
           ptr1--; ptr2--;
       }
       if(carry==1)
        result+="1";
       char [] arr = result.toCharArray();
       int len = arr.length;
       for(int i=0;i<arr.length/2;i++) {
           char temp = arr[i];
           arr[i]=arr[len-1-i];
           arr[len-1-i]=temp;
       }
       return String.valueOf(arr);
    }
}

