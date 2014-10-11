## leetcode - Pascals Triangle
- Time: 2014.10.01
- Tags: simulation

### Problem Description [link][1]
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5, return

```
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

### Solution
Just calculate every element in the triangle.


```java
import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
    	ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> lastrow, nextrow;
        for (int n = 0; n < numRows; n++){
        	lastrow = n > 0 ? triangle.get(n - 1) : new ArrayList<Integer>();
        	triangle.add(nextrow = new ArrayList<Integer>());
        	for (int i = 0; i <= n; i++)
        		nextrow.add((i == 0 || i == n) ? 1 : lastrow.get(i - 1) + lastrow.get(i));
        }
        return triangle;
    }
}
```

[1]: https://oj.leetcode.com/problems/pascals-triangle/ "pascals-triangle"

