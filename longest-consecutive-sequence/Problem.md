## leetcode - Longest Consecutive Sequence
- Time: 2014.09.28
- Tags: 

### Problem Description [link][1]

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given `[100, 4, 200, 1, 3, 2]`,
The longest consecutive elements sequence is `[1, 2, 3, 4]`. Return its length: `4`.

Your algorithm should run in O(n) complexity.

### Solution
Use hashset for O(1) check of if n exists in the array.

```java
import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] num) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int n : num){
        	hash.add(n);
        }
        int longest = 0, count = 0;
        for (int n : num){
            if (hash.contains(n)){
                count = 0;
                for (int i = n; hash.contains(i); i++){
                    count++;
                    hash.remove(i);
                }
                for (int i = n - 1; hash.contains(i); i--){
                    count++;
                    hash.remove(i);
                }
                longest = longest > count ? longest : count;
            }
        }
        return longest;
    }
}
```

[1]: https://oj.leetcode.com/problems/longest-consecutive-sequence/ "longest-consecutive-sequence"

