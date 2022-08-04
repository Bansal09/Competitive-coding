/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        int count=0;
        ListNode temp =head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    
    public ListNode move(ListNode head , int length){
        ListNode temp=head;
        for(int i=1;i<=length ; i++)
            temp=temp.next;
        return temp;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA , temp2=headB;
        int l1 = length(headA);
        int l2 = length(headB);
        
        if(l1>l2)
            temp1 = move(headA , Math.abs(l1-l2));
        else
            temp2 = move(headB , Math.abs(l1-l2));
        
        while(temp1!=null && temp2!=null){
            if(temp1 == temp2)
                return temp1;
            temp1=temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
    }
}