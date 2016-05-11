package sols;
import java.util.*;
    
public class Solution {
    public String getPermutation(int n, int k) {
        k--;
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
                    
        int f = 1;
        for (int i = 2; i < n; i++) {
            f *= i;
        }
        
        StringBuilder sb = new StringBuilder();
        int times = n - 1;
        while (times >= 0) {
            int index = k/f;
            sb.append(nums.get(index));
            nums.remove(index);
            k %= f;
            if (times != 0) f /= times;
            times--;
        }

        return sb.toString();
    }
}
