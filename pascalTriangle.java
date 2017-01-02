/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/pascals-triangle/
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if(numRows==0)
            return l;
        List<Integer> temp = new ArrayList<Integer> ();
        temp.add(1);
        l.add(temp);
        for(int i=1;i<numRows;i++) {
            List <Integer> re = new ArrayList <Integer> ();
            re.add(1);
            int prev=1;
            for(int j=1;j<l.get(i-1).size();j++) {
                int t=l.get(i-1).get(j);
                re.add(prev+t);
                prev=t;
            }
            re.add(1);
            l.add(re);
        }
        return l;    
    }
}