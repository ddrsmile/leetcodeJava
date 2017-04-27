package sols;
import java.util.*;

public class Solution {
  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<String>();
    if (digits == null || digits.length() == 0) {
        return res;
    }

    String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    StringBuilder sb = new StringBuilder();
    backTracking(digits, 0, letters, res, sb);
    return res;
  }

  private void backTracking(String digits, int index, String[] letters, List<String> res, StringBuilder sb) {
      if (index == digits.length()) {
          res.add(sb.toString());
          return;
      }

      int num = digits.charAt(index) - '0';
      for (int i = 0; i < letters[num].length(); i++) {
          sb.append(letters[num].charAt(i));
          backTracking(digits, index + 1, letters, res, sb);
          sb.deleteCharAt(sb.length() - 1);
      }
  }
}
