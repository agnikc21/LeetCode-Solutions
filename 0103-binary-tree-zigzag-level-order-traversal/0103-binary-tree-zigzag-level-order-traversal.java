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
    public void level(TreeNode root, TreeMap<Integer,List<Integer>> tmap, int hd){
        if (root==null) return;
        tmap.putIfAbsent(hd,new ArrayList<Integer>());
        tmap.get(hd).add(root.val);
        level(root.left,tmap,hd+1);
        level(root.right,tmap,hd+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeMap<Integer,List<Integer>> tmap= new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        level(root,tmap,0);
        for(int i: tmap.keySet()){
            if (i%2==0){
                ans.add(tmap.get(i));
            } else{
                Collections.reverse(tmap.get(i));
                ans.add(tmap.get(i));
            }
        }
        return ans;
    }
}