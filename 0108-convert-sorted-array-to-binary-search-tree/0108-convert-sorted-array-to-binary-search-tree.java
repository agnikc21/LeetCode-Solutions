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
    public static TreeNode builder(int[] nums,int start,int end){
        if (start>end) return null;
        int mid=(start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=builder(nums,start,mid-1);
        root.right=builder(nums,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return builder(nums, 0, nums.length-1);
    }
}