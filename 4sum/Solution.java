/**
	leetcode - 4sum
	Time: O(n^3)
	Space: O(n)
	Completed: 2014.11.07
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++){
            if (i > 0 && num[i] == num[i - 1])
                continue;
            for (int j = i + 1; j < num.length; j++){
                if (j > i + 1 && num[j] == num[j - 1])
                    continue;
                int r = num.length - 1;
                for (int l = j + 1; l < r; l++){
                    if (l > j + 1 && num[l] == num[l - 1])
                        continue;
                    while (l < r && num[i] + num[j] + num[l] + num[r] > target){
                        r--;
                    }
                    if (l < r && num[i] + num[j] + num[l] + num[r] == target){
                        ans.add(combination(num[i], num[j], num[l], num[r]));
                    }
                }
            }
        }
        return ans;
    }
    private ArrayList<Integer> combination(int a, int b, int c, int d){
        ArrayList<Integer> list = new ArrayList<Integer>(4);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        return list;
    }
}