package sols;
import java.util.*;
import objs.Interval;

public class Solution {
  public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() < 2) return intervals;
    List<Interval> res = new ArrayList<Interval>();
    Collections.sort(intervals, (a, b) -> (a.start - b.start));

    for (Interval i:intervals) {
      if (res.isEmpty() || i.start > res.get(res.size() - 1).end) {
        res.add(i);
      } else if (i.end > res.get(res.size() - 1).end) {
        res.get(res.size() - 1).end = i.end;
      }
    }
    return res;
  }
}
