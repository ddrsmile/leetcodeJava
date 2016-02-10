package sols;
import java.util.*;

public class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if (nums == null || nums.length == 0) return res;
    Arrays.sort(nums);
    boolean[] visit = new boolean[nums.length];
    List<Integer> item = new ArrayList<Integer>();
    bt(nums, visit, res, item);
    return res;
  }

  private void bt(int[] nums, boolean[] visit, List<List<Integer>> res, List<Integer> item) {
    if (item.size() == nums.length) {
      res.add(new ArrayList<Integer>(item));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] == nums[i - 1] && !visit[i - 1]) continue;
      if (visit[i]) continue;
      item.add(nums[i]);
      visit[i] = true;
      bt(nums, visit, res, item);
      item.remove(item.size() - 1);
      visit[i] = false;
    }
  }
}
