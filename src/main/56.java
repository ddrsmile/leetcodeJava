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
    
    ArrayList<ArrayList<int[]>> inIntLists = ih.getDataAsIntLists();
    List<Interval> intervals;
    for (int i = 0; i < inIntLists.size(); i++) {
      ArrayList<int[]> inIntList = inIntLists.get(i);
      intervals = new ArrayList<Interval>();
      
      if (inIntList == null || inIntList.size() == 0) {
        System.out.println("Input was null!");
        continue;
      } else if (inIntList.size() == 1 && (inIntList.get(0) == null || inIntList.get(0).length == 0)) {
        System.out.println("Input was null!");
        continue;
      }

      for (int j = 0; j < inIntList.size(); j++) {
        int s = inIntList.get(j)[0];
        int e = inIntList.get(j)[1];
        intervals.add(new Interval(s, e));
      }

       List<Interval> res = sol.merge(intervals);

      if (res == null) {
        System.out.println("null");
      } else {
        for (int j = 0; j < res.size(); j++) {
          System.out.print("[" + res.get(j).start + ", " + res.get(j).end + "]");
        }
        System.out.println();
      }
    }
  }
}
