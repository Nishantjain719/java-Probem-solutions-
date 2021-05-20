//Remove linked list elements input: 1->2->6->3->4->6 val= 6 output: 1->2->3->4 O(n)

class Solutin23 {
    public class ListNode {                                         
        int val;
        ListNode next;
      ListNode(int x) { val = x; }
    
    }
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.next.val == val) {
                current_node.next = current_node.next.next;
            } else {
                current_node = current_node.next;
            }
        }
        return head;
    }
}
