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
    Trees trees = new Trees();
    Solution sol = new Solution();
    
    ArrayList<String> inStr = ih.getDataAsStr();

    for (int i = 0; i < inStr.size(); i++) {
      String nodes = inStr.get(i);
      if (nodes.charAt(0) == '[' && nodes.charAt(nodes.length() - 1) == ']') {
        nodes = nodes.substring(1, nodes.length() - 1);
      }
      TreeNode rootIn = trees.getBT(nodes);
      System.out.println(sol.maxDepth(rootIn));
    }
  }
}
