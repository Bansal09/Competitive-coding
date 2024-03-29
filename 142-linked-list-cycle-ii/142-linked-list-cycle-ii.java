/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashMap<ListNode , Boolean> map = new HashMap<>();
        
        ListNode temp = head;
        
        while(temp!=null){
            if(map.containsKey(temp))
                return temp;
            map.put(temp , true);
            temp=temp.next;
        }
        
        return null;
    }
}