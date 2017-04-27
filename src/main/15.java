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
    for (int i = 0; i < inputList.size(); i++) {
      int[] nums = inputList.get(i);
      List<List<Integer>> res = sol.threeSum(nums);
      System.out.println(res.toString());
    }
  }
}
