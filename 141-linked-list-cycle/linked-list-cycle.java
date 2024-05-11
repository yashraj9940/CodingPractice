/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        ListNode fast=head.next;

        while(fast != head && fast!=null && fast.next!=null){
            head=head.next;
            fast=fast.next.next;
           
        }
         if(head!=fast)
                return false;
        return true;
    }
}