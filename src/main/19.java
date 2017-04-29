package main;
//Import the required classes of LeetCode;
import objs.*;
import utils.*;
import utils.inputparser.*;
import sols.*;

//Import the required libraries;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    // create integer parser
    ParserFactory<IntegerParser> factory = new ParserFactory<IntegerParser>(IntegerParser.class);
    IParser<Integer, int[]> intparser = factory.create(args[0]);
    // create solution object
    Solution sol = new Solution();
    // get input file's contents
    ArrayList<int[]> inputList = intparser.parseDataAsList();
    ListNodes listUtil = new ListNodes();
    for (int i = 0; i < inputList.size()/2; i++) {
      ListNode headIn = listUtil.getList(inputList.get(2*i));
      int n = inputList.get(2*i + 1)[0];
      ListNode headOut = sol.removeNthFromEnd(headIn, n);
      while (headOut.next != null) {
        System.out.print(headOut.val + ", ");
        headOut = headOut.next;
      }
      System.out.println(headOut.val);

    }
  }
}
