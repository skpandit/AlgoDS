/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/nim-game/
 */

public class Solution {
    public boolean canWinNim(int n) {
        if(n<=3)
            return true;
        if(n%4==0)
            return false;
        else
            return true;
}
}