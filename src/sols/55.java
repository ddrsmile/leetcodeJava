package sols;
import java.util.*;

public class Solution {
  public boolean canJump(int[] nums) {
    if (nums == null || nums.length == 1) return true;
    int maxCover = 0;
    for (int i = 0; i < nums.length && i <= maxCover; i++) {
      if (i + nums[i] > maxCover) maxCover = i + nums[i];
      if (i + nums[i] >= nums.length - 1) return true;
    }
    return false;
  }
}
