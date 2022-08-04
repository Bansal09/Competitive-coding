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
        ListNode fh , ft , t1=list1 , t2=list2;
        if(list1==null && list2!=null)
            return list2;
        if(list2==null && list1!=null)
            return list1;
        if(list1==null && list2==null)
            return null;
        if(list1.val < list2.val){
            fh = list1;
            ft = list1;
            t1=t1.next;
        }else{
            fh = list2;
            ft=list2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null){
            if(t1.val <= t2.val){
                ft.next=t1;
                ft=t1;
                t1=t1.next;
            }
            else
            {
                ft.next = t2;
                ft=t2;
                t2=t2.next;
            }
        }
        
        if(t1==null)
            ft.next=t2;
        else
            ft.next=t1;
        return fh;
    }
}