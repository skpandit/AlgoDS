/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/power-of-three/
 */

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        } 
        if (n <= 0) {
            return false;
        }
        double temp = Math.log10(n)/Math.log10(3);
        System.out.println(temp);
        if ((temp - (int)temp) > 0) {
            return false;    
        } 
        else {
            return true;
        }
        
    }
}