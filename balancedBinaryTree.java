/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/balanced-binary-tree/
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
    public int checkHeight(TreeNode root) {
        if(root==null)
            return 0;
        int lheight = checkHeight(root.left);
        if(lheight==-1)
            return -1;
        int rheight = checkHeight(root.right);
        if(rheight==-1)
            return -1;
        if(Math.abs(rheight-lheight)>1)
            return -1;
        else
            return (lheight>rheight?lheight+1:rheight+1);
            
    }
    public boolean isBalanced(TreeNode root) {
        if(checkHeight(root)==-1)
            return false;
        return true;
    }
}