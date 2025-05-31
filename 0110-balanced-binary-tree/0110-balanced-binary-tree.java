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
    public int deep(TreeNode root){
        if (root==null) return 0;
        int lmax= deep(root.left);
        int rmax= deep(root.right);
        return 1+ Math.max(lmax,rmax);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = deep(root.left);
        int rightDepth = deep(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}