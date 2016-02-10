package sols;
import java.util.*;

public class Solution {
  public List<List<String>> groupAnagram(String[] strs) {
    List<List<String>> res = new ArrayList<List<String>>();
    if (strs == null || strs.length == 0) return res;
    Arrays.sort(strs);
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    for (String str:strs) {
      char[] c = str.toCharArray();
      Arrays.sort(c);
      String s = String.valueOf(c);
      if (map.containsKey(s)) {
        map.get(s).add(str);
      } else {
        List<String> list = new ArrayList<String>();
        list.add(str);
        map.put(s, list);
      }
    }
    for (List<String> list:map.values()) {
      res.add(list);
    }
    return res;
  }
}
