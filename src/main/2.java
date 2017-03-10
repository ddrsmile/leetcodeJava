package main;
//Import the required classes of LeetCode;
import objs.*;
import utils.*;
import utils.inputparser.*;
import sols.Solution;

//Import the required libraries;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    AbstractParserFactory<Integer, int[]> factory = new IntegerParserFactory();
    IParser<Integer, int[]> intparser = factory.create(args[0]);
    ListNodes listNodeUtil = new ListNodes();
    Solution sol = new Solution();
    ArrayList<int[]> inputList = intparser.parseDataAsList();

    for (int i = 0; i < inputList.size()/2; i++) {
      ListNode l1 = listNodeUtil.getList(inputList.get(2*i));
      ListNode l2 = listNodeUtil.getList(inputList.get(2*i+1));
      ListNode output = sol.addTwoNumbers(l1, l2);
      if (output == null) {
        System.out.println("null");
        continue;
      }
      while (output.next != null) {
        System.out.print(output.val + ", ");
        output = output.next;
      }
      System.out.println(output.val);
    }
  }
}
