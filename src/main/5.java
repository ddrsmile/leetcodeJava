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
    AbstractParserFactory<String, String[]> factory = new StringParserFactory();
    IParser<String, String[]> stringParser = factory.create(args[0]);
    // create solution object
    Solution sol = new Solution();
    // get input file's contents
    ArrayList<String> inputValue = stringParser.parseDataAsSingleValue();

    for (int i = 0; i < inputValue.size(); i++) {
      String s = inputValue.get(i);
      System.out.println(sol.longestPalindrome(s));
    }
  }
}
