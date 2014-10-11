## leetcode - Two Sum
- Time: 2014.10.01
- Tags: hash

### Problem Description [link][1]

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

- Input: numbers=`{2, 7, 11, 15}`, target=`9`
- Output: index1=`1`, index2=`2`


### Solution
Using hash map or hash table will reduce the brutal force O(n^2) to O(n).

```java
import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int[] index = new int[2];
        for (int i = 0; i < numbers.length; i++){
        	if (hash.containsKey(target - numbers[i])){
        		index[0] = hash.get(target - numbers[i]) + 1;
        		index[1] = i + 1;
        		break;
        	}
        	hash.put(numbers[i], i);
        }
        return index;
    }
}
```

[1]: https://oj.leetcode.com/problems/two-sum/ "two-sum"

