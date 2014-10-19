## leetcode - Pascals Triangle Ii
- Time: 2014.10.19
- Tags: array

### Problem Description [link][1]
Given an index k, return the kth row of the Pascal's triangle.

For example, given `k = 3`,
Return `[1,3,3,1]`.

Note:
Could you optimize your algorithm to use only O(k) extra space?

### Solution
```java
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int n = 0; n <= rowIndex; n++){
            row.add(0, 1);
            for (int i = 1; i <= n/2; i++){
                row.set(i, row.get(n - i) + row.get(n - i + 1));
            }
            for (int i = n/2 + 1; i <= n; i++){
                row.set(i, row.get(n - i));
            }
        }
        return row;
    }
}
```

[1]: https://oj.leetcode.com/problems/pascals-triangle-ii/ "pascals-triangle-ii"

