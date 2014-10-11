## leetcode - String to Integer (atoi)
- Time: 2014.09.24
- Tags: strings

### Problem Description [link][1]

Implement `atoi` to convert a string to an integer.

**Hint:** Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

**Notes:** It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

**Requirements for `atoi`:**

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.


## Solution

Three corner conditions should be dealt with:

- empty string,
- preceding whitespaces or illegal charactors,
- positive or negtive symbol,
- integer exceeding the limits,
- following illegal charactors.

So the solution contains many condition checks.

## Code

```java

public class Solution{
    public int atoi(String str){
    	int i = 0;
    	while (i < str.length() && isWhitespace(str.charAt(i))) i++;
    	if (i >= str.length() || isWhitespace(str.charAt(i))) return 0;
    	int result = 0;
    	boolean bPositive = true;
    	if (str.charAt(i) == '+' || str.charAt(i) == '-'){
    		bPositive = (str.charAt(i) == '+');
    		i++;
    	}
    	for (; i < str.length() && isDigit(str.charAt(i)); i++){
    		result = addDigit(result, str.charAt(i) - '0', bPositive);
    	}
    	return result;
    }

    private int addDigit(int number, int digit, boolean bPositive){
    	if (bPositive){
    		if (number > Integer.MAX_VALUE / 10) return Integer.MAX_VALUE;
    		if (digit > Integer.MAX_VALUE - number * 10) return Integer.MAX_VALUE;
    		return number * 10 + digit;
    	}else{
    		if (number < Integer.MIN_VALUE / 10) return Integer.MIN_VALUE;
    		if (-digit < Integer.MIN_VALUE - number * 10) return Integer.MIN_VALUE;
    		return number * 10 - digit;
    	}
    }

	private boolean isWhitespace(char c){
		return c == ' ' || c == '\t' || c == '\r' || c == '\n';
	}

	private boolean isDigit(char c){
		return c >= '0' && c <= '9';
	}	
}
```

[1]: https://oj.leetcode.com/problems/string-to-integer-atoi/ "string-to-integer-atoi"

