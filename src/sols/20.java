package sols;
import java.util.*;

public class Solution {
  public boolean isValid(String s) {
    if (s == null || s.length()%2 != 0) return false;

    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.size() == 0) return false;
        char top = stack.pop();
        if (c == ')' ) {
          if (top != '(') return false;
        } else if (c == ']') {
          if (top != '[') return false;
        } else if (c == '}') {
          if (top != '{') return false;
        }
      }
    }
    return stack.size() == 0;
  }
}
