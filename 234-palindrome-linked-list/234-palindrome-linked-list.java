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
    
    public ListNode reverse(ListNode head){
        ListNode prev = null , curr = head , next =null;
        while(curr!=null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr;
            curr = next ;
        }
        
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head ;
        ListNode newh=null , nt = null;
        while(temp!=null){
            if(newh==null){
                newh= new ListNode(temp.val);
                nt=newh;
            }
            else{
                ListNode newnode = new ListNode(temp.val);
                nt.next = newnode;
                nt = newnode;
            }
            temp=temp.next;
        }
        temp=head;
        ListNode t1 = reverse(newh);
        ListNode t2 = t1;
        if(head==null)
            return true;
        
        while(temp!=null){
            if(temp.val!=t2.val)
                return false;
            temp=temp.next;
            t2=t2.next;
        }
        
        return true;
    }
}