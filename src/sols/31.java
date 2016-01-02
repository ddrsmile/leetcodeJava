package sols;
import java.util.*;

public class Solution {
  public void nextPermutation(int[] nums) {
    if (nums.length < 2) return;
    int i = nums.length - 1;
    int j = nums.length - 1;

    while (i > 0 && nums[i] <= nums[i - 1]) i--;

    if (i > 0) {
      while (nums[j] <= nums[i - 1]) j--;
      swap(nums, i - 1, j);
    }
    reverse(nums, i, nums.length - 1);
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  private void reverse(int[] nums, int s, int e) {
    while (s < e) swap(nums, s++, e--);
  }
}
