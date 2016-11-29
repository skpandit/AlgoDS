/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/4sum/
 */
 
 public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashSet <List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int start=j+1;
                int end=nums.length-1;
                int sum=target-(nums[i]+nums[j]);
                while(start<end){
                    if(nums[start]+nums[end]>sum)
                        end=end-1;
                    else if(nums[start]+nums[end]<sum)
                        start=start+1;
                    else{
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        if(set.contains(temp)) {
                    	    start=start+1;
                    	    end=end-1;
                            continue;
                        } else {
                            set.add(temp);
                            ans.add(temp);
                        }
                        start=start+1;
                        end=end-1;
                    }
                }
            }
        }
        return ans;
    }
}
