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
    
    ArrayList<int[]> inIntList = ih.getDataAsIntList();

    for (int i = 0; i < inIntList.size()/2; i++) {
      int[] arr1 = inIntList.get(2*i);
      int[] arr2 = inIntList.get(2*i + 1);
      System.out.println(sol.findMedianSortedArrays(arr1, arr2));
    }
  }
}
