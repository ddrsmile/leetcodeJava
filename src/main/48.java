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
    
    ArrayList<int[][]> inIntMatrix = ih.getDataAsIntMatrix();
    int[][] matrix;
    for (int i = 0; i < inIntMatrix.size(); i++) {
      matrix = inIntMatrix.get(i);
      sol.rotate(matrix);
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(Arrays.toString(matrix[j]));
      }
      System.out.println();
    }
  }
}
