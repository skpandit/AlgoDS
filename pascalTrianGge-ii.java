/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/pascals-triangle-ii/
 */

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> l = new ArrayList<Integer>();
            l.add(1);
            int prev=1;
            for(int j=1;j<temp.size();j++) {
                int curr = temp.get(j);
                l.add(prev+curr);
                prev=curr;
            }
            l.add(1);
            temp=l;
        }
        return temp;
    }
}