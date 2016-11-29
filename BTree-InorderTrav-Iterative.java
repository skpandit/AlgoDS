/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack <TreeNode> st = new Stack <TreeNode>();
        List <Integer> ret = new ArrayList <Integer>();
        while(true) {
            while(root!=null) {
                st.push(root);
                root=root.left;
            }
            if(st.isEmpty())
                break;
            root = st.pop();
            ret.add(root.val);
            root=root.right;
        }
        return ret;
    }
}
