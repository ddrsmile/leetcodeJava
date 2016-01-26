package sols;
import java.util.*;

public class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if (target == 0) {
      res.add(new ArrayList<Integer>());
      return res;
    }
    if (candidates == null || candidates.length == 0) return res;
    Arrays.sort(candidates);
    List<Integer> item = new ArrayList<Integer>();
    bt(candidates, target, 0, res, item);
    return res;

  }

  private void bt(int[] candidates, int target, int index, List<List<Integer>> res, List<Integer> item) {
    if (target < 0) return;
    if (target == 0) {
      res.add(new ArrayList<Integer>(item));
      return;
    }

    for (int i = index; i < candidates.length; i++) {
      if (i > 0 && candidates[i] == candidates[i - 1]) continue;
      int new_target = target - candidates[i];
      item.add(candidates[i]);
      // input i because of that the element can be repeated.
      bt(candidates, new_target, i, res, item);
      item.remove(item.size() - 1);
    }
  }
}
