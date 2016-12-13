/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/power-of-four/
 */

public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0)
            return false;
        if(num==1)
            return true;
        while(num>1){
            if(num%4 !=0)
                return false;
            num=num/4;
        }
        if(num==1)
            return true;
        else
            return false;
    }
}