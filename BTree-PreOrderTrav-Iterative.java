/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> l = new ArrayList<Integer>();
        if(root==null)
            return l;
        l.add(root.val);
        while(true){
            if(root.right!=null)
                s.push(root.right);
            if(root.left!=null)
                s.push(root.left);
            if(s.isEmpty())
                break;
            root=s.pop();
            l.add(root.val);
        }
        return l;
    }
}
