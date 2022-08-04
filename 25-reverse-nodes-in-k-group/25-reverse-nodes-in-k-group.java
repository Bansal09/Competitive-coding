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
    
    public DoubleNode reverse(ListNode head){
       if(head==null || head.next==null){
           DoubleNode ans = new DoubleNode();
           ans.head=head;
           ans.tail=head;
           return ans;
       }
        
        DoubleNode output=reverse(head.next);
        output.tail.next=head;
        head.next=null;
        
        DoubleNode ans=new DoubleNode();
        ans.head=output.head;
        ans.tail=head;
        return ans;
        
        
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
            return null;
        if(k==0)
            return head;
        ListNode temp=head;
        int count=1;
        while(count<k && temp.next!=null){
            count++;
            temp=temp.next;
        }
        if(count!=k)
            return head;
        ListNode h2=temp.next;
        temp.next=null;
        DoubleNode h1=reverse(head);
        ListNode fhead=reverseKGroup(h2, k);
        h1.tail.next=fhead;
        return h1.head;
    }
    
}

class DoubleNode{
    ListNode head;
    ListNode tail;
}