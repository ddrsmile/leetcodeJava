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
    
    ArrayList<ArrayList<int[]>> innLs = ih.getDataAsListNumList();

    for (int i = 0; i < innLs.size(); i++) {
      ArrayList<int[]> innL = innLs.get(i);
      ListNode[] lists = new ListNode[innL.size()];
      
      for (int j = 0; j < innL.size(); j++) {
        ListNode head = listUtil.getList(innL.get(j));
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
