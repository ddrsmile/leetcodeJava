package main;
//Import the required classes of LeetCode;
import objs.*;
import utils.*;
import sols.*;

//Import the required libraries;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    InputHandler ih = new InputHandler(args[0]);
    ListNodes listUtil = new ListNodes();
    Solution sol = new Solution();
    
    ArrayList<int[]> inIntList = ih.getDataAsIntList();

    for (int i = 0; i < inIntList.size()/2; i++) {
      ListNode head = listUtil.getList(inIntList.get(2*i));
      ListNode node = head;
      int n = inIntList.get(2*i + 1)[0];
      for (int j = 1; j < n; j++) {
        node = node.next;
      }
      sol.deleteNode(node);
      while (head.next != null) {
        System.out.print(head.val + ", ");
        head = head.next;
      }
      System.out.println(head.val);
    }
  }
}
