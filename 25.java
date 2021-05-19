// 1->2->3->4 
// 1->2->null; 4->3->null; then merge both of the list like 1->6; 6->2; and so on.
import java.util.*;

class Solutin23 {
    public class ListNode {                                         
        int val;
        ListNode next;
      ListNode(int x) { val = x; }
    
    }
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode l1 = head;
        ListNode slow = head; // Head of second half.
        ListNode fast = head; 
        ListNode prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l2 = reverse(slow);
        merge(l1, l2);
    }
    public ListNode reverse(ListNode head) {
        ListNode prev_node = null;
        ListNode current_node = head;

        while(current_node != null) {
            ListNode next_node = current_node.next;
            current_node.next = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }

        return prev_node;
    }

    public void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;

            l1.next = l2;

            if (l1_next == null) {
                break;
            }

            l2.next = l1_next;
            l1 = l2_next;
            l2 = l2.next;

        }
    }
}
