/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public static void postorder(Node root, List<Integer> ans){
        if (root==null) return;
        for (Node a: root.children){
            postorder(a,ans);
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        postorder(root,ans);
        return ans;
    }
}