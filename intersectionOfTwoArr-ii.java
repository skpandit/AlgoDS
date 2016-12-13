/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(!m.containsKey(nums1[i]))
                m.put(nums1[i],1);
            else {
                int temp = m.get(nums1[i]);
                m.put(nums1[i],temp+1);
            }
        }
        List <Integer> l = new ArrayList <Integer>();
        for(int j=0;j<nums2.length;j++){
            if(m.containsKey(nums2[j]))
            {
                int val = m.get(nums2[j]);
                if(val>0)
                {   
                    l.add(nums2[j]);
                    m.put(nums2[j],val-1);
                }
            }
        }
        int [] arr = new int [l.size()];
        int o=0;
        for (Integer i: l)
        {
            arr[o++]=i;
        }
        
        return arr;
    }
}