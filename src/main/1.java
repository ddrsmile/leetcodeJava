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
    // create integer parser
    AbstractParserFactory<Integer, int[]> factory = new IntegerParserFactory();
    IParser<Integer, int[]> intparser = factory.create(args[0]);
    // create solution object
    Solution sol = new Solution();
    // get input file's contents
    ArrayList<int[]> inputList = intparser.parseDataAsList();
    // run solution through all input cases
    for (int i = 0; i < inputList.size()/2; i++) {
      int[] nums = inputList.get(2*i);
      int target = inputList.get(2*i + 1)[0];
      int[] res = sol.twoSum(nums, target);
      System.out.println(Arrays.toString(res));
    }
  }
}
