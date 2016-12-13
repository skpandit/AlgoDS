/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return root;
        if(p.val<root.val && q.val<root.val) return (lowestCommonAncestor(root.left,p,q));
        else if (p.val>root.val && q.val>root.val) return (lowestCommonAncestor(root.right,p,q));
        return root;
    }
}