/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int min (int a, int b){
    return a<b?a:b;
}
int minDepth(struct TreeNode* root) {
    if(root==NULL)
        return 0;
    if(root->left==NULL && root->right==NULL)
        return 1;
    else if(root->left==NULL) 
        return minDepth(root->right)+1;
    else if(root->right==NULL)
        return minDepth(root->left)+1;
    else
        return min(minDepth(root->left),minDepth(root->right))+1;

}