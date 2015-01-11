## leetcode - Combination Sum
- Time: 2014.12.16
- Tags: combination

### Problem Description [link][1]
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, `a1 ≤ a2 ≤ … ≤ ak`).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
`[7]`
`[2, 2, 3]` 

### Solution
```java
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (candidates.length == 0){
            return answer;
        }
        
        Arrays.sort(candidates);
        int j = candidates.length - 1;
        for (int i = j - 1; i >= 0; i--){
            if (candidates[i + 1] != candidates[i]){
                candidates[--j] = candidates[i];
            }
        }
        
        fillCombination(answer, candidates, new int[candidates.length], j, target);
        return answer;
    }
    
    public static void fillCombination(List<List<Integer>> ans, int[] cand, int[] num, int s, int sum){
        if (sum == 0){
            LinkedList<Integer> comb = new LinkedList<Integer>();
            for (int i = 0; i < cand.length; i++){
                for (int j = 0; j < num[i]; j++){
                    comb.add(cand[i]);
                }
            }
            ans.add(comb);
            return;
        }
        if (s == cand.length){
            return;
        }
        for (int i = sum / cand[s]; i >= 0; i--){
            num[s] = i;
            fillCombination(ans, cand, num, s + 1, sum - i * cand[s]);
        }
        num[s] = 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/combination-sum/ "combination-sum"

