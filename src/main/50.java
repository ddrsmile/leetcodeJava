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
    
    ArrayList<Double> inDouble = ih.getDataAsDouble();
    for (int i = 0; i < inDouble.size()/2; i++) {
      double x = inDouble.get(2*i);
      int n = inDouble.get(2*i + 1).intValue();
      System.out.println(sol.myPow(x, n));
    }
  }
}
