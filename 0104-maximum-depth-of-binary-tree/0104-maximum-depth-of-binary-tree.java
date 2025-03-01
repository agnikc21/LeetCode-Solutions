
class Solution {
    public static int treeHeight(TreeNode root) {
        if (root == null) return 0; 
        int lcount = treeHeight(root.left);   
        int rcount = treeHeight(root.right); 
        return 1 + Math.max(lcount, rcount);
    }
    public int maxDepth(TreeNode root) {
        return treeHeight(root);
    }
}