## leetcode - Merge Intervals
- Time: 2014.10.21
- Tags: sort, array, greedy

### Problem Description [link][1]
Given a collection of intervals, merge all overlapping intervals.

For example,
Given `[1,3],[2,6],[8,10],[15,18]`,
return `[1,6],[8,10],[15,18]`.

### Solution
```java
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        sort(intervals, 0, intervals.size() - 1);
        ArrayList<Interval> ans = new ArrayList<Interval>(intervals.size());
        for (int i = 0; i < intervals.size(); i++){
            int s = intervals.get(i).start, e = intervals.get(i).end;
            while (i < intervals.size() - 1 && intervals.get(i + 1).start <= e){
                e = Math.max(e, intervals.get(++i).end);
            }
            ans.add(new Interval(s, e));
        }
        ans.trimToSize();
        return ans;
    }
    
    private void sort(ArrayList<Interval> a, int l, int r){
        if (l >= r) 
            return;
        int m = l + (r - l) / 2;
        Interval pivot = a.get(m);
        a.set(m, a.get(l));
        int i = l, j = r;
        while (i < j){
            while (i < j && a.get(j).start >= pivot.start) 
                j--;
            if (i < j){
                a.set(i, a.get(j));
                i++;
            }
            while (i < j && a.get(i).start <= pivot.start)
                i++;
            if (i < j){
                a.set(j, a.get(i));
                j--;
            }
        }
        a.set(i, pivot);
        if (r - l > 1){
            sort(a, l, i);
            sort(a, i + 1, r);
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/merge-intervals/ "merge-intervals"

