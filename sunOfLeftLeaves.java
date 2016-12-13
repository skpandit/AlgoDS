/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/sum-of-left-leaves/
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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeavesHelper(root,false);
        return sum;
    }
    public void sumOfLeftLeavesHelper (TreeNode root, boolean isLeft) {
        if(root!=null)
        {
            if(isLeft == true && root.left==null && root.right==null)
                sum+=root.val;
            sumOfLeftLeavesHelper(root.left,true);
            sumOfLeftLeavesHelper(root.right,false);
        }
    }
}