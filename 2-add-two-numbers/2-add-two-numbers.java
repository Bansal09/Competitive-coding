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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=null , temp = null;
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        int sum=0 , carry=0;
        while(l1!=null && l2!=null){
            sum=l1.val + l2.val + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10 , null);
            if(h1==null){
                h1=node;
                temp=node;
            }
            else{
                temp.next=node;
                temp=node;
            }
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            sum=l1.val + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10 , null);
            temp.next=node;
            temp=node;
            l1=l1.next;
        }
        
         while(l2!=null){
            sum=l2.val + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10 , null);
            temp.next=node;
             temp=node;
             l2=l2.next;
        }
        
        if(carry>0)
            temp.next=new ListNode(carry , null);
        return h1;
    }
}