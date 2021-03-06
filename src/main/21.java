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
      ListNode l1 = listUtil.getList(inIntList.get(2*i));
      ListNode l2 = listUtil.getList(inIntList.get(2*i+1));
      ListNode headOut = sol.mergeTwoLists(l1, l2);
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
