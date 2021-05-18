//Partition List Input: head = 1->4->3->2->5->2, x = 3
// outputa: 1->2->2->4->3->5
class Solution3 {
    public class ListNode {                                         
        int val;
        ListNode next;
      ListNode(int x) { val = x; }
    
    }
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {
            if (head.val < x) {
               before.next = head;
               before = before.next;
            } else {
                after.next = head;
                after = after.next;

            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next; // this line connects two lists at end means we connect before list to after list
    
        return before_head.next;
       }
  
}

