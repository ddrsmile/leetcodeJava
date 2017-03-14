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
    ParserFactory<StringParser> factory = new ParserFactory<StringParser>(StringParser.class);
    IParser<String, String[]> stringParser = factory.create(args[0]);
    Solution sol = new Solution();
    
    ArrayList<String> inputValue = stringParser.parseDataAsSingleValue();
    for (int i = 0; i < inputValue.size()/2; i++) {
      String s = inputValue.get(2*i);
      int nRow = Integer.parseInt(inputValue.get(2*i + 1));
      System.out.println(sol.convert(s, nRow));
    }
  }
}
