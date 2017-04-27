package sols;

public class Solution {
  public boolean isMatch(String s, String p) {
    boolean dp[][] = new boolean[p.length() + 1][s.length() + 1];

    dp[0][0] = true;

    for (int i = 2; i <= p.length(); i++) {
        dp[i][0] = dp[i - 2][0] && p.charAt(i - 1) == '*';
    }

    for (int i = 1; i <= p.length(); i++) {
        for (int j = 1; j <= s.length(); j++) {
            if (p.charAt(i - 1) != '*') {
                dp[i][j] = dp[i - 1][j - 1] && (p.charAt(i - 1) == s.charAt(j - 1) || p.charAt(i - 1) == '.');
            } else {
                dp[i][j] = dp[i - 2][j] || dp[i - 1][j];
                if (p.charAt(i - 2) == s.charAt(j - 1) || p.charAt(i - 2) == '.') {
                    dp[i][j] |= dp[i][j - 1];
                }
            }
        }
    }
    return dp[p.length()][s.length()];
  }
}
