/**
	leetcode - Subsets Ii
	Time: O(2^n)
	Space: O(n * 2^n)
	Completed: 2014.11.09
*/
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        int[] cnt = new int[num.length];
        int n = 0;
        for (int x : num){
            if (n == 0 || x != num[n - 1]){
                num[n++] = x;
                cnt[n - 1] = 1;
            }else{
                cnt[n - 1]++;
            }
        }
        
        int size = 1;
        for (int c : cnt){
            size *= c + 1;
        }
        List<List<Integer>> subsets = new ArrayList<List<Integer>>(size);
        ArrayList<Integer> set = new ArrayList<Integer>(num.length);
        search(subsets, set, num, cnt, n, 0);
        return subsets;
    }
    
    private void search(List<List<Integer>> subsets, ArrayList<Integer> set, int[] num, int[] cnt, int n, int k){
        if (k == n){
            subsets.add((List<Integer>)set.clone());
            return;
        }
        for (int i = 0; i <= cnt[k]; i++){
            search(subsets, set, num, cnt, n, k + 1);
            set.add(num[k]);
        }
        for (int i = 0; i <= cnt[k]; i++){
            set.remove(set.size() - 1);
        }
    }
}