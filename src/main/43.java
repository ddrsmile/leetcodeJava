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
    
    ArrayList<String> inStr = ih.getDataAsStr();

    for (int i = 0; i < inStr.size()/2; i++) {
      String num1 = inStr.get(2*i);
      String num2 = inStr.get(2*i + 1);
      System.out.println(sol.multiply(num1, num2));
    }
  }
}
