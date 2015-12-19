package sols;
import objs.ListNode;

public class Solution {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode c = head;
    ListNode res = new ListNode(0);
    ListNode p = res;
    p.next = head;

    while (c != null && c.next != null) {
      ListNode nc = c.next.next;
      c.next.next = c;
      p.next = c.next;
      c.next = nc;
      p = c;
      c = c.next;
    }
    return res.next;
  }
}
