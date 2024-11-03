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
    public ListNode reverseList(ListNode head) {
        ListNode a=null,b=head,c=null;

          if(head==null || head.next==null)
            return head;

        while(b.next!=null){
            c=b.next;
            b.next=a;
             a=b;
            b=c;
           
        }
        b.next=a;
        return b;
        

    }
}