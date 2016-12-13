/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/happy-number/
 */

public class Solution {
    public boolean isHappy(int n) {
        HashMap map = new HashMap();
        n=getSquare(n);
        while(n!=1)
        {
            if(map.containsKey(n))
                break;
            else{
                map.put(n,n);
                n=getSquare(n);
            }
        }
        if(n==1)
            return true;
        else
            return false;
        
    }
    public int getSquare(int n){
        int result=0;
        while(n>0){
            result+=Math.pow(n%10,2);
            n=n/10;
        }
        return result;
    }
}