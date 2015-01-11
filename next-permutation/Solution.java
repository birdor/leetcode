/**
	leetcode - Next Permutation
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.6
*/
public class Solution {
    public void nextPermutation(int[] num) {
        int t = num.length - 1;
        for (; t > 0 && num[t - 1] >= num[t]; t--);
        if (t > 0){
            int k = t;
            for (int i = k; i < num.length && num[i] > num[t - 1]; i++){
                k = i;
            }
            swap(num, t - 1, k);
        }
        for (int i = t, j = num.length - 1; i < j; i++, j--){
            swap(num, i, j);
        }
    }
    public void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}