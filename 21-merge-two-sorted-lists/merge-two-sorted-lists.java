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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l_final=new ListNode();
        ListNode l=l_final;
        while(list1!=null && list2!=null){
             ListNode temp=new ListNode();
            if(list1.val>list2.val){
                temp.val=list2.val;
                list2=list2.next;
            }
            else
            {
                temp.val=list1.val;
                list1=list1.next;
                
            }
           // l.val=temp.value;
            l.next=temp;
            l=l.next;
            
        }
        if(list2!=null){
           
             l.next=list2;
           
        } 
        if(list1!=null){
           
             l.next=list1;
           
        }
        return l_final.next;
        
        
    }
}