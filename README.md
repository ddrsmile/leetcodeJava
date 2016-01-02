# leetcodeJava [![Build Status](https://travis-ci.org/ddrsmile/leetcodeJava.svg?branch=master)](https://travis-ci.org/ddrsmile/leetcodeJava)  
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

    ArrayList<int[]> inIntList = ih.getDataAsIntList();
    for (int i = 0; i < inIntList.size()/2; i++) {
      int[] nums = inIntList.get(2*i);
      int target = inIntList.get(2*i + 1)[0];
      int[] res = sol.twoSum(nums, target);
      System.out.println(Arrays.toString(res));
    }
  }
}
```
put the file into "currentdir/src/main/"  
##### InputHandler
InputHandler class receives String variable which contents the path of input files to create the object.
  
Integer  
getDataAsInt() returns ArrayList<Integer>  
getDataAsIntList() returns ArrayList<int[]>  
getDataAsIntLists() returns ArrayList<ArrayList<int[]>>  
  
double Float  
getDataAsDouble() returns ArrayList<Double>  
getDataAsDoubleList() returns ArrayList<double[]>  
getDataAsDoubleLists() returns ArrayList<ArrayList<double[]>>  
  
String  
getDataAsStr() returns ArrayList<String>  
getDataAsStrList() returns ArrayList<String[]>  
  
##### InputCheck  
InputCheck class is used by InputHandler.  
The program will be stopped and the inappropriate contents will be shown when it is detected.  
The follows are the check points:  
1. Integer. ``` (1, 2, 34, -4, -62, ...)```  
2. Integer list. ``` ([1, 2, 34, -4], [34, -4, -62], [0, 3, 19], ...) ```  
3. The List of the Integer lists. ``` ([[1, 2, 34, -4], [34, -4, -62], [0, 3, 19]], ...) ```    
4. double Float. ``` (1.2, 32.2, 0.9, -5.2, -12.2, ...) ```  
5. double Float list. ``` ([1.2, 32.2, 0.9], [0.9, -5.2, -12.2], [0.0, 2.98, -84.234], ...) ```  
6. The List of the double Float lists. ``` ([[1.2, 32.2, 0.9], [0.9, -5.2, -12.2], [0.0, 2.98, -84.234]], ...) ```  

##### P.S.
1) Integer or double Float is valided for the check of the list and the list of the lists.  
2) [] is valided for the check of the list.  
3) [], [[]] are valided for the check of the list of the lists.  


### 3. prepare the input file
write down your input contents in the txt file, and then name the file with the # of problem.  
one input (one arguement) one line.  
```java
Solution.sol1(int a)
Solution.sol2(int a, int b)
```  
For sol1, one line per test case. On the other hand, for sol2, two lines per testcase.  
For example,
```txt
[2, 7, 11, 15]
9
```
##### some simple rule
single number:  
```txt
1  
1.3  
```  
String:  
```txt
"string"
```  
int array:
```txt
[1,3,4]
```  
string array:  
to be implement....

To create the listNode, use int array as input.  
```txt
[1,3,4]
```  
To create the binary tree, use String as input. Use # as the null node.
```txt
[1,2,#,4,5]
```  

### 4. ./run.sh # of problem.
ex. ">./run.sh 1" will run the problem 1 and show the output.
