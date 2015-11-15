package sols;

public class Solution {
  public boolean canWinNim(int n) {
    if (n < 1) return false;
    return n%4 == 0;
  }
}
