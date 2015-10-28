import java.util.*;
public class Main {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] res = sol.twoSum(nums, target);
    System.out.println(Arrays.toString(res));
  }
}
