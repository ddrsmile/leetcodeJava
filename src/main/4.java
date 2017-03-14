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
    ParserFactory<IntegerParser> factory = new ParserFactory<IntegerParser>(IntegerParser.class);
    IParser<Integer, int[]> intParser = factory.create(args[0]);

    Solution sol = new Solution();
    ArrayList<int[]> inputList = intParser.parseDataAsList();

    for (int i = 0; i < inputList.size()/2; i++) {
      int[] arr1 = inputList.get(2*i);
      int[] arr2 = inputList.get(2*i + 1);
      System.out.println(sol.findMedianSortedArrays(arr1, arr2));
    }
  }
}
