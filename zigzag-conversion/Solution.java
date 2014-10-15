/**
	leetcode - Zigzag Conversion
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.15
*/
public class Solution {
    public String convert(String s, int nRows) {
        if (nRows == 1) return s;
        int lenPattern = nRows * 2 - 2;
        String ans = "";
        for (int i = 0; i < nRows; i++){
            for (int b = 0; b < s.length(); b += lenPattern){
                if (b + i < s.length()) 
                    ans += s.charAt(b + i);
                if (i > 0 && i < nRows - 1 && b + lenPattern - i < s.length())
                    ans += s.charAt(b + lenPattern - i);
            }
        }
        return ans;
    }
}