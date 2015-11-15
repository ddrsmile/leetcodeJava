package sols;
import objs.ListNode;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;

    ListNode head = new ListNode(0);
    ListNode p = head;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      int current = 0;
      if (l1 != null) {
        current += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        current += l2.val;
        l2 = l2.next;
      }
      if (carry != 0) {
        current += carry;
      }
      p.next = new ListNode(current%10);
      p = p.next;
      carry = current/10;
    }
    return head.next;
  }
}
