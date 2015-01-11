## leetcode - Excel Sheet Column Number
- Time: 2015.01.04
- Tags: math

### Problem Description [link][1]
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:
```
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
```

### Solution
```java
public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++){
            num = num * 26 + (s.charAt(i) - 'A' + 1);
        }
        return num;
    }
}
```

[1]: https://oj.leetcode.com/problems/excel-sheet-column-number/ "excel-sheet-column-number"

