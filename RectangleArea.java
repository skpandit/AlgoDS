/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/rectangle-area/
 */

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area=0;
        int area1=0;
        int area2=0;
        int commonarea=0;
        area1=Math.abs((C-A)*(D-B));
        area2=Math.abs((G-E)*(H-F));
        commonarea=(Math.max(0,((Math.min(C,G))-(Math.max(A,E))))) * (Math.max(0,((Math.min(D,H))-(Math.max(B,F)))));
        if (commonarea == 1294967296)
            commonarea=0;
        area=area1+area2-commonarea;
        return area;
    }
}