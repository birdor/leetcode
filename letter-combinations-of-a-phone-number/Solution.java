/**
	leetcode - Letter Combinations Of A Phone Number
	Time: O(3^n)
	Space: O(n)
	Completed: 2015.1.16
*/
public class Solution {
    static final String[] candidates = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> answer = new LinkedList<String>();
        StringBuffer buffer = new StringBuffer(digits.length());
        buffer.setLength(digits.length());
        combinations(digits, 0, buffer, answer);
        return answer;
    }
    private void combinations(String digits, int i, StringBuffer buffer, List<String> answer){
        if (i >= digits.length()){
            answer.add(buffer.toString());
            return;
        }
        String letters = candidates[digits.charAt(i) - '0'];
        for (int j = 0; j < letters.length(); j++){
            buffer.setCharAt(i, letters.charAt(j));
            combinations(digits, i + 1, buffer, answer);
        }
    }
}