/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node main_head = head;
        if(head == null)
            return null;
        
        Node tmp_head = new Node(head.val);
        
        Node cur_main = head;
        Node cur_tmp = tmp_head;
        
        while(cur_main != null) {
            if(cur_tmp == null)
                cur_tmp = new Node(cur_main.val);
            
            Node cur_next_main = cur_main.next;
            cur_main.next = cur_tmp;
            cur_tmp.next = cur_next_main;
            cur_tmp.random = cur_main.random;
            cur_main = cur_next_main;
            cur_tmp = null;
        }
        
        cur_main = head;
        cur_tmp = tmp_head;
        
        while(cur_tmp != null) {
            Node cur_tmp_next = cur_tmp.next != null ? cur_tmp.next.next:null;
            cur_tmp.random = cur_tmp.random != null?cur_tmp.random.next : null;
            cur_tmp = cur_tmp_next;
        }
        cur_tmp = tmp_head;
        while(cur_tmp != null) {
            Node cur_tmp_next = cur_tmp.next != null ? cur_tmp.next.next:null;
            cur_main.next = cur_tmp.next;
            cur_tmp.next = cur_tmp_next;
            cur_main = cur_main.next;
            cur_tmp = cur_tmp.next;
        }
        
        return tmp_head;
    }
}