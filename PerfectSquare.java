/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/perfect-squares/
 */
 
 public class Solution {
    public int numSquares(int n) {
        int result=0;
        int [] arr = new int[n+1];
        arr[0]=0;
        int temp=0;
        for(int i=1; i<=n;i++){
            temp=(int)Math.sqrt(i);
            if(temp*temp == i)
                arr[i]=1;
            else
            {
                int min=Integer.MAX_VALUE;
                for(int j=1; j<i;j++){
                    if(arr[j]+arr[i-j] < min)
                        min=arr[j]+arr[i-j];
                }
                arr[i]=min;
            }
        }
        return arr[n];
    }
}
