/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/path-sum/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
  
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
        {
            return root.val==sum?true:false;
        }
        else{
            return (hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val));
        }
        
    }
}
