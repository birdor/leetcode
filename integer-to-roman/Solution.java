/**
	leetcode - Integer to Roman
	time: O(n)
	space: O(n)
*/

public class Solution {
    public String intToRoman(int num) {
    	String romanNum = "";
    	for (int i = 0; num > 0; i++){
    		romanNum = represent[i][num % 10] + romanNum;
    		num = num / 10;
    	}
    	return romanNum;
    }
    private String[][] represent = {
    	{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
    	{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
    	{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
    	{"", "M", "MM", "MMM"}
    };
}
