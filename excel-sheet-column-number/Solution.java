/**
	leetcode - Excel Sheet Column Number
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.4
*/
public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++){
            num = num * 26 + (s.charAt(i) - 'A' + 1);
        }
        return num;
    }
}