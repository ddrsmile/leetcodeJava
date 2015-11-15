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
    
    ArrayList<String> ins = ih.getInputData();

    for (int i = 0; i < ins.size(); i++) {
      TreeNode rootIn = trees.getBT(ins.get(i));
      System.out.println(sol.maxDepth(rootIn));
    }
  }
}

//handle input data, makes it match each solution.
//this section should be modified for each solution.
class InputHandler{
  String inputPath;
  ArrayList<String> ins;
  
  public InputHandler(String inputPath) {
    this.inputPath = inputPath;
    ins = null;
  }
  
  public ArrayList<String> getInputData() throws IOException {
    if (inputPath.length() == 0) return ins;
    ins = new ArrayList<String>();
    BufferedReader br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      ins.add(in.replace(" ", "").replace("[","").replace("]",""));
    }
    return ins;
  }
}
