/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/counting-bits
 */
 public class Solution {
    public int[] countBits(int num) {
        int [] arr = new int [num+1];
        arr[0]=0;
        if(num>=1)
            arr[1]=1;
        int power=0;
        for(int i=2;i<=num;i++){
            if((i&(i-1)) == 0){
                arr[i]=1;power=i;}
            else if(i%2==0){
                arr[i]=1+arr[i-power];
            }
            else
                arr[i]=arr[i-1]+1;
        }
        return arr;
    }
}
