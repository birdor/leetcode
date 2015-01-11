## leetcode - Reverse Words In A String
- Time: 2014.11.09
- Tags: 

### Problem Description [link][1]
Given an input string, reverse the string word by word.

For example,
Given s = `"the sky is blue"`,
return `"blue is sky the"`.


### Solution
```java
public class Solution {
    public String reverseWords(String s) {
        StringBuffer r = new StringBuffer(s.length());
        for (int i = s.length() - 1, j = s.length(); i >= 0; i--){
            if (s.charAt(i) == ' '){
                j = i;
            }else if (i == 0 || s.charAt(i - 1) == ' '){
                if (r.length() > 0)
                    r.append(" ");
                r.append(s.substring(i, j));
            }
        }
        return r.toString();
    }
}
```

[1]: https://oj.leetcode.com/problems/reverse-words-in-a-string/ "reverse-words-in-a-string"

