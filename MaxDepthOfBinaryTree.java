/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else {
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            if(ldepth>rdepth)
                return ldepth + 1;
            else
                return rdepth + 1;
        }
    }
}