/**
	leetcode - Valid Number
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.19
*/
public class Solution {
    public boolean isNumber(String s) {
        s = s.trim().toLowerCase().replace('-', '+');
        if (hasInvalidChar(s) || s.length() == 0)
            return false;
       	String parts[];
        if (s.contains("e")){
			parts = s.split("e");
			if (parts.length != 2)
				return false;
			if (parts[1].charAt(0) == '+')
			    parts[1] = parts[1].substring(1);
			if (parts[1].contains("+"))
			    return false;
			if (parts[0].length() == 0 || parts[1].length() == 0 || parts[1].contains("."))
				return false;
			s = parts[0];
        }
        if (s.charAt(0) == '+'){
			s = s.substring(1);
			if (s.length() == 0)
			    return false;
	    }
	    if (s.contains("+"))
	        return false;
        if (s.contains(".")){
        	parts = s.split("\\.");
        	if (parts.length == 0)
        		return false;
        }
        return true;

    }
    private boolean hasInvalidChar(String s){
        int nDots = 0, nEs = 0;
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) < '0' || s.charAt(i) > '9') && s.charAt(i) != '.' && s.charAt(i) != 'e' && s.charAt(i) != '+'){
                return true;
            }
            if (s.charAt(i) == '.') 
                nDots++;
            if (s.charAt(i) == 'e')
                nEs++;
        }
        return nDots > 1 || nEs > 1;
    }
}