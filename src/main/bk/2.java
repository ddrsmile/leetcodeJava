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
    
    ArrayList<int[]> ins = ih.getInputData();

    for (int i = 0; i < ins.size()/2; i++) {
      ListNode l1 = listUtil.getList(ins.get(2*i));
      ListNode l2 = listUtil.getList(ins.get(2*i+1));
      ListNode headOut = sol.addTwoNumbers(l1, l2);
      if (headOut == null) {
        System.out.println("null");
        continue;
      }
      while (headOut.next != null) {
        System.out.print(headOut.val + ", ");
        headOut = headOut.next;
      }
      System.out.println(headOut.val);
    }
  }
}

//handle input data, makes it match each solution.
//this section should be modified for each solution.
class InputHandler{
  String inputPath;
  ArrayList<int[]> ins;
  
  public InputHandler(String inputPath) {
    this.inputPath = inputPath;
    ins = null;
  }
  
  public ArrayList<int[]> getInputData() throws IOException {
    if (inputPath.length() == 0) return ins;
    ins = new ArrayList<int[]>();
    BufferedReader br = new BufferedReader(new FileReader(inputPath));
    String in = null;
    while ((in = br.readLine()) != null) {
      ins.add(getList(in));
    }
    return ins;
  }

  private int[] getList(String str) {
    str = str.replace(" ","").replace("[","").replace("]","");
    if (str.length() == 0) return new int[0];
    String[] nums = str.split(",");
    int[] out = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      out[i] = Integer.parseInt(nums[i]);
    }
    return out;
  }

}

