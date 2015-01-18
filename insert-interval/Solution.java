/**
	leetcode - Insert Interval
	Time: O(n)
	Space: O(n)
	Completed: 2015.1.17 
*/
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> set = new LinkedList<Interval>();
        if (newInterval == null){
            return intervals;
        }
        boolean added = false;
        for (Interval v : intervals){
            if (v.end < newInterval.start){
                set.add(v);
            }else if (v.start > newInterval.end){
                if (!added){
                    set.add(newInterval);
                    added = true;
                }
                set.add(v);
            }else{
                newInterval.start = Math.min(newInterval.start, v.start);
                newInterval.end = Math.max(newInterval.end, v.end);
            }
        }
        if (!added){
            set.add(newInterval);
        }
        return set;
    }
}