/**
	leetcode - Sqrtx
	Time: 
	Space: 
	Completed:
*/
public class Solution {
    public int sqrt(int x) {
        if (x == 0) return 0;
        int i = 1, j = x;
        while (i < j - 1){
            int k = i + (j - i) / 2;
            if ((long)k * k > x){
                j = k;
            }else{
                i = k;
            }
        }
        return i;
    }
}