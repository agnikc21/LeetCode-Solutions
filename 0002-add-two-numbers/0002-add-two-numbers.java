/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3= new ListNode(0);
        ListNode head= l3;
        int carry = 0;
        while (l1!=null || l2!=null || carry!=0){
            int dig1 = l1==null?0:l1.val;
            int dig2 = l2==null?0:l2.val;
            int sum=dig1+dig2+carry;
            carry=sum/10;
            sum%=10;

            ListNode temp = new ListNode(sum);
            l3.next=temp;
            l3=l3.next;

            l1 = l1==null ? null : l1.next;
            l2 = l2==null ? null : l2.next;


        }

        head=head.next;

        return head;
    }
}