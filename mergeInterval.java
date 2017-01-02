/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/merge-intervals/
 */

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

class IntervalCompare implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {
        
        return o1.start-o2.start;
    }
}
public class Solution {
    
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new IntervalCompare());
        List<Interval> result = new ArrayList<Interval>();
        if(intervals.size() == 0)
            return result;
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++) {
            int new_start=intervals.get(i).start;
            int new_end=intervals.get(i).end;
                if(new_start<=end) {
                    if(new_end>end) {
                        end=new_end;
                    }
                } else {
                    result.add(new Interval(start,end));
                    start=new_start;
                    end=new_end;
                }
             
        }
        if(start!=-1 && end!=-1) {
            result.add(new Interval(start,end));
        }
        return result;
    }
}