package sols;
import java.util.*;

public class Solution {
  public int removeDuplicates(int[] nums, int val) {
    if (nums == null || nums.length == 0) return 0;
    
    int len = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) continue;
      len++;
      nums[len] = nums[i];
    }
    return len + 1;
  }
}
