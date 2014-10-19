## leetcode - 3sum
- Time: 2014.10.17
- Tags: hard, array

### Problem Description [link][1]
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.

For example, given array `S = {-1 0 1 2 -1 -4}`,

A solution set is:
```
(-1, 0, 1)
(-1, -1, 2)
```


### Solution
It's hard to write a bug-free program for this problem. The solution should be considered very carefully.
```java
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++){
        	if (i > 0 && num[i] == num[i - 1])
        		continue;
        	for (int j = i + 1, k = num.length - 1; j < k; j++){
        		if (j > i + 1 && num[j] == num[j - 1])
        			continue;
        		while (j < k && num[i] + num[j] + num[k] > 0)
        			k--;
        		if (j < k && num[i] + num[j] + num[k] == 0){
        			ArrayList<Integer> tmp = new ArrayList<Integer>();
        			tmp.add(num[i]);
        			tmp.add(num[j]);
        			tmp.add(num[k]);
        			ans.add(tmp);
        		}
        	}        	
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/3sum/ "3sum"

