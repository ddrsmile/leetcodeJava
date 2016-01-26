package sols;
import java.util.*;

public class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if (target == 0) {
      res.add(new ArrayList<Integer>());
      return res;
    }
    if (candidates == null || candidates.length == 0) return res;
    Arrays.sort(candidates);
    boolean[] visit = new boolean[candidates.length];
    List<Integer> item = new ArrayList<Integer>();
    bt(candidates, target, 0, res, item, visit);
    return res;

  }

  private void bt(int[] candidates, int target, int index, List<List<Integer>> res, List<Integer> item, boolean[] visit) {
    if (target < 0) return;
    if (target == 0) {
      res.add(new ArrayList<Integer>(item));
      return;
    }

    for (int i = index; i < candidates.length; i++) {
      if (i > 0 && candidates[i] == candidates[i - 1] && visit[i - 1] == false) continue;
      int new_target = target - candidates[i];
      visit[i] = true;
      item.add(candidates[i]);
      // input i+1 because of that the element can be used only once..
      bt(candidates, new_target, i + 1, res, item, visit);
      item.remove(item.size() - 1);
      visit[i] = false;
    }
  }
}
