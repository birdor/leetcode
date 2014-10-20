/**
	leetcode - Find Minimum In Rotated Sorted Array
	Time: O(log n)
	Space: O(1)
	Completed: 2014.10.20
*/
public class Solution {
    public int findMin(int[] num) {
        return lookForMin(num, 0, num.length - 1);
    }
    private int lookForMin(int[] num, int l, int r){
        if (num[l] <= num[r])
            return num[l];
        int m = l + (r - l) / 2;
        if (num[m] > num[r])
            return lookForMin(num, m + 1, r);
        else
            return lookForMin(num, l, m);
    }
}