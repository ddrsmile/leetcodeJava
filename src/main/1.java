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
    IntegerParser intparser = new IntegerParser(args[0]);
    //InputHandler ih = new InputHandler(args[0]);
    Solution sol = new Solution();
    
    //ArrayList<int[]> inIntList = ih.getDataAsIntList();
    ArrayList<int[]> inIntList = intparser.parseDataAsList();
    for (int i = 0; i < inIntList.size()/2; i++) {
      int[] nums = inIntList.get(2*i);
      int target = inIntList.get(2*i + 1)[0];
      int[] res = sol.twoSum(nums, target);
      System.out.println(Arrays.toString(res));
    }
  }
}
