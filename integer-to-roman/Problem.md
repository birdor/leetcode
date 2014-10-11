## leetcode - Integer to Roman
- Time: 2014.09.24
- Tags: warmup

### Problem Description [link][1]

Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

### Solution

Pre-defining the table of each digit at different positions is an easy way to do this.

### Code

```java
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

```


[1]: https://oj.leetcode.com/problems/integer-to-roman/ "integer-to-roman"