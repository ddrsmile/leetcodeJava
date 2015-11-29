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
    
    ArrayList<int[]> innL = ih.getDataAsNumList();
    for (int i = 0; i < innL.size()/2; i++) {
      int[] nums = innL.get(2*i);
      int target = innL.get(2*i + 1)[0];
      System.out.println(sol.threeSumClosest(nums, target));
    }
  }
}
