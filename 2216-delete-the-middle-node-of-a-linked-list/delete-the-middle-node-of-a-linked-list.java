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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        return null;
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        ListNode s=head,f=head,t=s;
        while(f!=null && f.next!=null){
            f=f.next.next;
            t=s;
            s=s.next;
        }
        t.next=t.next.next;
        return head;
        
    }
}