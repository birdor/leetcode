/**
	leetcode - Regular Expression Matching
	Time: O(?)
	Space: O(n)
	Completed: 2014.10.15
*/
public class Solution {
    public boolean isMatch(String s, String p) {
        // remove continuous '*'s in p
        String p2 = "";
        for (int i = 0; i < p.length(); i++)
            if (i == 0 || p.charAt(i) != '*' || p.charAt(i) == '*' && p.charAt(i) != p.charAt(i - 1))
                p2 += p.charAt(i);
        p = p2;
        
        return compPos(s, 0, p, 0);
    }
    
    public boolean compPos(String s, int i, String p, int j){
        if (j == p.length())
            return i == s.length();
        if (j < p.length() - 1 && p.charAt(j + 1) == '*'){
            if (compPos(s, i, p, j + 2)){
                return true;
            }else if (i >= s.length() || s.charAt(i) != p.charAt(j) && p.charAt(j) != '.'){
                return false;
            }else{
                return compPos(s, i + 1, p, j);            
            }
        }else{
            if (i >= s.length() || s.charAt(i) != p.charAt(j) && p.charAt(j) != '.'){
                return false;
            }else{
                return compPos(s, i + 1, p, j + 1);
            }
        }
    }
}