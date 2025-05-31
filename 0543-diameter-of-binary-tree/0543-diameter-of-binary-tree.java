/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=0;
    public int deep(TreeNode root){
        if (root==null) return 0;
        int lmax= deep(root.left);
        int rmax = deep(root.right);
        res=Math.max(res,lmax+rmax);
        return 1+Math.max(lmax,rmax);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return res;
    }
}