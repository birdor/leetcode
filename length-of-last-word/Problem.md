## leetcode - Length Of Last Word
- Time: 2014.11.07
- Tags: string

### Problem Description [link][1]
Given a string s consists of upper/lower-case alphabets and empty space characters `' '`, return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
given `s = "Hello World"`,
return `5`.

### Solution
```java
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--){
            if (words[i].length() > 0){
                return words[i].length();
            }
        }
        return 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/length-of-last-word/ "length-of-last-word"

