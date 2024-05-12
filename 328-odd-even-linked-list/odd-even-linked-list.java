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
    public ListNode oddEvenList(ListNode h) {
         if (h == null) return null;
        ListNode o=h,e=h.next,eh=e;
        while(o.next!=null && e.next!=null){
          
            o.next=o.next.next;
            e.next=e.next.next;
            o=o.next;
            e=e.next;
        }
          o.next=eh;
   
      
        return h;
        
    }
}