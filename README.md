# leetcodeJava
This repository manages source I used to practice the algorithms on LeetCode with Java.  
All the problems belong to LeetCode.  
https://leetcode.com/  
Besides, not all the solutions are my original works.  
I did consult lots of resource on the internet.  
Mac OS X  

## Quick Start  
### 1. source setEnv.sh  
### 2. prepare the files  
#### 2.1 solutions  
write down the solution with the class Solution, and then name the file with the # of the problem.  
ex. file name like 1.java which contents the solution of problem 1.  
```java
package sols;
import java.util.*;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] res = {-1, -1};
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        res[0] = map.get(target - nums[i]);
        res[1] = i + 1;
        break;
      } else {
        map.put(nums[i], i + 1);
      }
    }
    return res;
  }
}
```
put the file into "currentdir/src/sols/"
#### 2.2 main
write down the main procedure with the class, and then name the file with the # of the problem.
ex. file name like 1.java
```java
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

    ArrayList<int[]> inn = ih.getDataAsNum();
    for (int i = 0; i < inn.size()/2; i++) {
      int[] nums = inn.get(2*i);
      int target = inn.get(2*i + 1)[0];
      int[] res = sol.twoSum(nums, target);
      System.out.println(Arrays.toString(res));
    }
  }
}
```
put the file into "currentdir/src/main/"  
### 3. ./run.sh # of problem.
ex. ">./run.sh 1" will run the problem 1 and show the output.
