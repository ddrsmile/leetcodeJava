package sols;
import java.util.*;

public class Solution {
  public List<String> restoreIpAddresses(String s) {
    List<String> res = new ArrayList<String>();
    if (s == null || s.length() == 0) return res;
    bt(s, 0, new String[4], 0, res);
    return res;
  }

  private void bt(String s, int index, String[] ip, int part_cnt, List<String> res) {
    if (part_cnt >= 4 && index != s.length()) return;
    if (part_cnt == 4 && index == s.length()) res.add(String.join(".", ip));

    for (int i = index + 1; i <= s.length(); i++) {
      String sub = s.substring(index, i);
      if (sub.charAt(0) == '0' && sub.length() > 1) return;
      if (Integer.parseInt(sub) > 255) return;
      ip[part_cnt] = sub;
      bt(s, i, ip, part_cnt + 1, res);
    }
  }
}
