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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head,f=head;
        Stack<Integer> ss=new Stack<>();
    
        while(f!=null && f.next!=null){
            ss.add(s.val);

            s=s.next;
            f=f.next.next;
           
        }
       
      
        if(f!=null)
        s=s.next;

        while(!ss.isEmpty() && s!=null){
            if(ss.pop()!=s.val)
                return false;
            s=s.next;
        }
        return true;
        
    }
}