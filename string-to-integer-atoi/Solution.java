/**
	leetcode - String to Integer (atoi)
	Time: O(n)
	Space: O(n)
*/


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