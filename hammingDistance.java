/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/hamming-distance/
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int count=0;
        for(int i=0;i<32;i++) {
            if((xor&(1<<i)) >= 1)
                count++;
        }
        return count;
    }
}