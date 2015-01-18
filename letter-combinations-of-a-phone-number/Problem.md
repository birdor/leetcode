## leetcode - Letter Combinations Of A Phone Number
- Time: 2015.01.16
- Tags: 

### Problem Description [link][1]
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string `"23"`
Output: `["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]`.

Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.


### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/letter-combinations-of-a-phone-number/ "letter-combinations-of-a-phone-number"

