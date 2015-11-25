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
    Solution sol = new Solution();
    
    ArrayList<String> ins = ih.getDataAsStr();
    for (int i = 0; i < ins.size()/2; i++) {
      String s = ins.get(2*i);
      int nRow = Integer.parseInt(ins.get(2*i + 1));
      System.out.println(sol.convert(s, nRow));
    }
  }
}
