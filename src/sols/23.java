package sols;
import java.util.*;
import objs.ListNode;

public class Solution {
  public ListNode removeNthFromEnd(ListNode[] lists) {
    if (lists == null || lists.length == 0) return null;
    return merges(lists, 0, lists.length - 1);
  }

  private ListNode merges(ListNode[] lists, int low, int high) {
    if (low < high) {
      int mid = low + (high - low)/2;
      ListNode left = merges(lists, low, mid);
      ListNode right = merges(lists, mid+1, high);
      return mergeTwo(left, right);
    }
    return lists[0];
  }

  private ListNode mergeTwo(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    ListNode head = new ListNode(0);
    ListNode p = head;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        p.next = l1;
        p = p.next;
        l1 = l1.next;
      } else {
        p.next = l2;
        p = p.next;
        l2 = l2.next;
      }
    }
    if (l1 != null) p.next = l1;
    if (l2 != null) p.next = l2;
    return head.next;
  }
}
