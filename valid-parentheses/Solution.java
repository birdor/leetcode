/**
	leetcode - Valid Parentheses
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.19
*/
import java.util.LinkedList;
public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++){
            char c2 = s.charAt(i);
            if (c2 == '(' || c2 == '[' || c2=='{'){
                stack.push(c2);
            }else{
                char c1 = stack.size() > 0 ? stack.pop() : 0;
                if (c1 == '(' && c2 != ')' || c1 == '[' && c2 != ']' || c1 == '{' && c2 != '}' || c1 == 0)
                    return false;
            }
        }
        return stack.size() == 0;
    }
}