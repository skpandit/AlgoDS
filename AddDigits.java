/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/add-digits/
 */

public class Solution {
    public int addDigits(int num) {
        if(num < 10)
            return num;
        else
            {
                double temp = Math.floor((num-1)/9.0);
                int result = num - (9*(int)temp);
                return result;
            }
   
    }
}