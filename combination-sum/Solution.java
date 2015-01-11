/**
	leetcode - Combination Sum
	Time: O(2^n)
	Space: O(2^n)
	Completed: 2014.12.16
*/
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