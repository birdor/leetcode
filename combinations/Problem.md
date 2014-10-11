## leetcode - Combinations
- Time: 2014.09.27
- Tags: combinatorics, search

### Problem Description [link][1]

Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

```
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```


### Solution

Depth-first search will work.

```java
import java.util.ArrayList;
public class Solution{
    public ArrayList<ArrayList<Integer>> combine(int n, int k){
    	ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
    	search(n, k, answer, tmp);
    	return answer;
    }
    public void search(int n, int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> tmp){
    	int start = tmp.isEmpty() ? 1 : tmp.get(tmp.size() - 1) + 1;
    	for (int i = start; i <= n; i++) {
    		tmp.add(i);
    		if (tmp.size() == k)
    			ans.add(new ArrayList<Integer>(tmp));
    		else
	    		search(n, k, ans, tmp);
    		tmp.remove(tmp.size() - 1);
    	}
    }
}
```

[1]: https://oj.leetcode.com/problems/combinations/ "combinations"

