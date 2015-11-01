package sols;
import java.util.*;
import objs.ListNode;

public class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || head.next == null) return head;

    ListNode slow = head;
    ListNode fast = head;
    
    for (int i = 0; i < n; i++) {
      fast = fast.next;
    }
    if (fast == null) {
      head = head.next;
      return head;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;
    return head;
  }
}
