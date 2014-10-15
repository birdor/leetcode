## leetcode - Zigzag Conversion
- Time: 2014.10.15
- Tags: simulation

### Problem Description [link][1]
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
```
string convert(string text, int nRows);
```
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".


### Solution
```java
public class Solution {
    public String convert(String s, int nRows) {
        if (nRows == 1) return s;
        int lenPattern = nRows * 2 - 2;
        String ans = "";
        for (int i = 0; i < nRows; i++){
            for (int b = 0; b < s.length(); b += lenPattern){
                if (b + i < s.length()) 
                    ans += s.charAt(b + i);
                if (i > 0 && i < nRows - 1 && b + lenPattern - i < s.length())
                    ans += s.charAt(b + lenPattern - i);
            }
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/zigzag-conversion/ "zigzag-conversion"

