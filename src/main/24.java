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
    
    ArrayList<int[]> innL = ih.getDataAsNumList();

    for (int i = 0; i < innL.size(); i++) {
      ListNode head = listUtil.getList(innL.get(i));
      ListNode headOut = sol.swapPairs(head);
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
