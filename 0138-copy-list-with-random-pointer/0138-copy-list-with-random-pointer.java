/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hmap = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            hmap.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node copy = hmap.get(cur);
            copy.next = hmap.get(cur.next);
            copy.random = hmap.get(cur.random);
            cur = cur.next;
        }

        return hmap.get(head);        
    }
}