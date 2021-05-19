// remove nth node from the end of list.
// We just need to go to the node before the one to be removed The node that we are trying to reach is at 'n + 1' from the end of the list
import java.util.*;

class Solutin23 {
    public class ListNode {                                         
        int val;
        ListNode next;
      ListNode(int x) { val = x; }
    
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
// We can implement a two pointer approach 
        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
// One pointer 'fast' will first move forward 'n+1' steps
        for (int i=1; i <= n+1; i++) {
            fast = fast.next;
        }
// After 'fast' moved 'm' steps The 'slow' moves in the same pace as 'fast' until 'fast' reaches to null node
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy_head.next;
    }
}
