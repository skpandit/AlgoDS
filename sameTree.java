/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/same-tree/
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if (p==null || q==null)
            return false;
        if(p.val!=q.val)
            return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
}