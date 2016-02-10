package sols;
import java.util.*;

public class Solution {
  public int firstMissingPositive(int[] nums) {
    if (nums == null || nums.length == 0) return 1;
    int i = 0;
    int end = nums.length;
    while (i < end) {
      if (nums[i] == i + 1 || nums[i] <=0 || nums[i] > end) {
        i++;
      } else if (nums[i] != nums[nums[i] - 1]) {
        swap(nums, i, nums[i] - 1);
      } else {
        i++;
      }
    }
    i = 0;

    while (i < end && nums[i] == i + 1) {
      i++;
    }
    return i + 1;
  }

  private void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
  }
}
