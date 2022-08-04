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
        int tcount=0;
        ListNode temp = head;
        if(head.next==null && n==1)
            return null;
        while(temp!=null)
        {
            tcount++;
            temp=temp.next;
        }
        if(tcount==n)
            return head.next;
        
        int c = tcount- n;
        int c1=1;
         temp=head;
        while(c1<c)
        {
            c1++;
            temp=temp.next;
        }
        
        if(temp.next!=null)
            temp.next=temp.next.next;
        else
            temp.next=null;
        return head;
    }
}