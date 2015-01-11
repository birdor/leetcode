/**
	leetcode - Find Peak Element
	Time: O(log(n))
	Space: O(1)
	Completed: 2014.12.10
*/
public class Solution {
    public int findPeakElement(int[] num) {
        int l = 0, r = num.length - 1;
        while (l < r){
            int k = l + (r - l) / 2;
            if (val(num, k) > val(num, k + 1)){
                if (val(num, k - 1) < val(num, k)){
                    return k;
                }else{
                    r = k;
                }
            }else{
                l = k + 1;
            }
        }
        return l;
    }
    int val(int[] num, int i){
        return (i >= 0 && i < num.length) ? num[i] : Integer.MIN_VALUE;
    }
}