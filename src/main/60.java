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
    
        ArrayList<Integer> inInt = ih.getDataAsInt();
        for (int i = 0; i < inInt.size()/2; i++) {
            int n = inInt.get(2*i);
            int k = inInt.get(2*i + 1);
            System.out.println(sol.getPermutation(n, k));
        }
    }
}
