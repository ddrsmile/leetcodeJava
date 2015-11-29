package sols;
import java.util.*;

public class Solution {
  public int threeSumClosest(int[] nums, int target) {
    if (nums == null || nums.length < 3) return 0;
    
    Arrays.sort(nums);
    int res = 0;
    int min = (1<<31)-1;

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) continue;
      int low = i + 1;
      int high = nums.length - 1;

      while (low < high) {
        int sum = nums[i] + nums[low] + nums[high];
        int diff = sum - target;

        if (Math.abs(diff) < min) {
          res = sum;
          min = Math.abs(diff);
        }

        if (diff <= 0) {
          if (diff == 0) {
            return res;
          } 
          low++;
          while (low < high && nums[low] == nums[low - 1]) {
            low++;
          } 
        } else {
          high--;
          while (low < high && nums[high] == nums[high + 1]) {
            high--;
          } 
        }
      }
    }
    return res;
  }
}
