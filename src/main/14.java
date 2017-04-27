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
    ParserFactory<StringParser> factory = new ParserFactory<StringParser>(StringParser.class);
    IParser<String, String[]> stringParser = factory.create(args[0]);
    Solution sol = new Solution();
    
    ArrayList<String[]> inputList = stringParser.parseDataAsList();
    for (int i = 0; i < inputList.size(); i++) {
      String[] strs = inputList.get(i);
      System.out.println(sol.longestCommonPrefix(strs));
    }
  }
}
