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
      ListNode headIn = listUtil.getList(inIntList.get(2*i));
      int n = inIntList.get(2*i + 1)[0];
      ListNode headOut = sol.removeNthFromEnd(headIn, n);
      while (headOut.next != null) {
        System.out.print(headOut.val + ", ");
        headOut = headOut.next;
      }
      System.out.println(headOut.val);

    }
  }
}
