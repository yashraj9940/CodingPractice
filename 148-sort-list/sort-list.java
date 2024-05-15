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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=mid(head);
       
        ListNode lh=head;
        ListNode rh=mid.next;
        mid.next=null;
        lh=sortList(lh);
        rh=sortList(rh);
        return merge(lh,rh);       
    }
    ListNode mid(ListNode h){
       ListNode f=h.next;
       ListNode s=h;
       while(f!=null && f.next!=null){
        f=f.next.next;
        s=s.next;
       } 
       return s;
    }
    ListNode merge(ListNode l,ListNode r){
        ListNode tempH=new ListNode(-1);
        ListNode temp=tempH;
        ListNode t1=l,t2=r;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                temp.next=t1;
                t1=t1.next;
                temp=temp.next;
            }
            else 
            {
                temp.next=t2;
                t2=t2.next;
                temp=temp.next;
            }

        }  
        if(t1!=null) temp.next= t1;
         if(t2!=null) temp.next= t2;

         return tempH.next;
        
     }



}