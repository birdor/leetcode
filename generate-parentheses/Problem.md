## leetcode - Generate Parentheses
- Time: 2015.01.21
- Tags: stack, string

### Problem Description [link][1]

### Solution
```java
public class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuffer buffer = new StringBuffer(n * 2);
        List<String> answer = new LinkedList<String>();
        fillBuffer(answer, buffer, 0, n);
        return answer;
    }
    private void fillBuffer(List<String> answer, StringBuffer buffer, int cnt, int num){
        if (buffer.length() == num * 2){
            answer.add(buffer.toString());
            return;
        }
        if (buffer.length() + cnt < num * 2){
            buffer.append('(');
            fillBuffer(answer, buffer, cnt + 1, num);
            buffer.setLength(buffer.length() - 1);
        }
        if (cnt > 0){
            buffer.append(')');
            fillBuffer(answer, buffer, cnt - 1, num);
            buffer.setLength(buffer.length() - 1);
        }
        
    }
}
```

[1]: https://oj.leetcode.com/problems/generate-parentheses/ "generate-parentheses"

