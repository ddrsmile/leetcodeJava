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
    
    ArrayList<ArrayList<int[]>> inIntLists = ih.getDataAsIntLists();

    for (int i = 0; i < inIntLists.size(); i++) {
      ArrayList<int[]> inIntList = inIntLists.get(i);
      ListNode[] lists = new ListNode[inIntList.size()];
      
      for (int j = 0; j < inIntList.size(); j++) {
        ListNode head = listUtil.getList(inIntList.get(j));
        lists[j] = head;
      }

      ListNode headOut = sol.mergeKLists(lists);

      if (headOut == null) {
        System.out.println("null");
        continue;
      }
      while (headOut.next != null) {
        System.out.print(headOut.val + ", ");
        headOut = headOut.next;
      }
      System.out.println(headOut.val);
    }
  }
}
