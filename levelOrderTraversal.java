/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> bigList = new ArrayList <List<Integer>> ();
        if(root==null)
            return bigList;
        List<Integer> myList = new ArrayList<Integer>();
        LinkedList <TreeNode> current = new LinkedList<TreeNode>();
        LinkedList <TreeNode> next = new LinkedList<TreeNode>();
        current.add(root);
        while(!current.isEmpty()) {
            TreeNode temp = current.remove();
            if(temp.left!=null)
                next.add(temp.left);
            if(temp.right!=null)
                next.add(temp.right);
            myList.add(temp.val);
            if(current.isEmpty()){
                current=next;
                next = new LinkedList<TreeNode> ();
                bigList.add(myList);
                myList = new ArrayList<Integer>();
            }
        }
        return bigList;
    }
}