/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(!m.containsKey(nums1[i]))
                m.put(nums1[i],0);
        }
        int count=0;
        for(int j=0;j<nums2.length;j++){
            if(m.containsKey(nums2[j]))
            {
                if(m.get(nums2[j])==0)
                {    m.put(nums2[j],1);count++;}
            }
        }
        int [] arr = new int [count];
        int u=0;
        Iterator in = m.entrySet().iterator();
        while(in.hasNext()){
            Map.Entry <Integer,Integer>mu = (Map.Entry<Integer,Integer>)in.next();
            if(mu.getValue()==1)
                arr[u++]=mu.getKey();
        }
        return arr;
    }
}