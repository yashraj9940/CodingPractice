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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int l=0;
        ListNode s=head;
        while(s!=null){
            s=s.next;
            l++;
        }
        if(l==1)
        return null;
        l=l-n+1;
        s=head;
        if(l==1){
            return head.next;
        }
        while(l>2){
          s=s.next;
          l--;
        }
      s.next=s.next.next;

        return head;
        
        
        
    }
}