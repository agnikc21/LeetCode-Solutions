/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==headB) return headA;
        ListNode finder = headB;
        while (headA!=null){
            while(finder!=null){
                if(finder==headA || finder.next==headA){
                    return headA;
                }
                finder=finder.next;
            }
            finder=headB;
            headA=headA.next;
        }
        return null;
    }
}