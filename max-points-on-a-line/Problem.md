## leetcode - Max Points On A Line
- Time: 2014.10.19
- Tags: hash table, hard

### Problem Description [link][1]
Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.

### Solution
Many mistakes on type casting. For example, `map.get(0)` and `map.get((long)0)` have different results.

`return dy << 32 + dx` and `return (long)dy << 32 + (long)dx` are also different.

```java
import java.util.HashMap;
public class Solution {
    public int maxPoints(Point[] points) {
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        int ans = 0;
        for (int i = 0; i < points.length; i++){
            map.clear();
            int maxSep = 0;
            for (int j = i; j < points.length; j++){
                long key = combinedKey(points[i].x - points[j].x, points[i].y - points[j].y);
                int value = map.containsKey(key)? map.get(key) + 1 : 1;
                map.put(key, value);
                maxSep = (key != (long)0 && value > maxSep)? value : maxSep;
                ans = Math.max(ans, maxSep + map.get((long)0));
            }
        }
        return ans;
    }
    private long combinedKey(int dx, int dy){
        if (dx != 0 || dy != 0){
            int g = gcd(dx, dy);
            dy = (dx/g > 0)? dy/g : -dy/g;
            dx = (dx/g > 0)? dx/g : -dx/g;
        }
        return ((long)dy << 32) + (long)dx;
    }

    private int gcd(int x, int y){
        if (x == 0) return y;
        return gcd(y % x, x);
    }
}
```

[1]: https://oj.leetcode.com/problems/max-points-on-a-line/ "max-points-on-a-line"

