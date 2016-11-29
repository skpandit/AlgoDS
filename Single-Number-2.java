/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/single-number-ii/
 */
 
  public class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> m = new HashMap <Integer,Integer>();
        for(int i=0; i<nums.length;i++){
            if(m.containsKey(nums[i])){
                
                m.put(nums[i],((int)(m.get(nums[i]))+1));
            }
            else
                m.put(nums[i],1);
        }
        for(Integer i:m.keySet()){
            if(m.get(i)==1)
                return i;
        }
        return -1;
    }
}
