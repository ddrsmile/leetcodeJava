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
class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
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
