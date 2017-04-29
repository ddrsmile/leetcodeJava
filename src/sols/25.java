package sols;
import objs.ListNode;

public class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (k <= 1 || head == null || head.next == null) return head;
    ListNode res = new ListNode(0);
    res.next = head;
    ListNode pre = res;
    ListNode tail = res;
    ListNode cur = head;
    ListNode tmp;

    while (true) {
        // check whether there are still k elements from the current node.
        // return res.next if there is no k elemnts from the current node.
        for (int i = 0; i < k; i++) {
            tail = tail.next;
            if (tail == null) {
                return res.next;
            }
        }
        // reverse k elements with the current node as the start node.
        for (int i = 0; i < k - 1; i++) {
            tmp = cur.next;
            cur.next = tmp.next;
            tmp.next = pre.next;
            pre.next = tmp;
        }
        pre = cur;
        tail = cur;
        cur = pre.next;
    }
  }
}
