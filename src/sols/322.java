package sols;
import java.util.*;

public class Solution {
  public int coinChange(int[] coins, int amount) {
    if (amount <= 0) return 0;
    if (coins == null || coins.length == 0) return -1;

    int[] dp = new int[amount + 1];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    for (int i = 0; i < amount; i++) {
      if (dp[i] < 0) continue;
      for (int c:coins) {
        if (i + c > amount) continue;
        if (dp[i + c] < 0 || dp[i + c] > dp[i] + 1) {
          dp[i + c] = dp[i] + 1;
        }
      }
    }
    return dp[amount];
  }
}
