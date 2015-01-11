## leetcode - Roman To Integer
- Time: 2014.12.17
- Tags: simulation

### Problem Description [link][1]
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


### Solution
```java
public class Solution {
    int num = 0; 
    public int romanToInt(String s) {
        num = 0;
        s = s.toUpperCase();
        s = strToInt(s, 'M', '.', '.', 1000);
        s = strToInt(s, 'C', 'D', 'M', 100);
        s = strToInt(s, 'X', 'L', 'C', 10);
        s = strToInt(s, 'I', 'V', 'X', 1);
        return num;
    }
    
    public String strToInt(String s, char c1, char c5, char c10, int unit){
        int t = 0;
        while (t < s.length() && (c1 == s.charAt(t) || c5 == s.charAt(t) || c10 == s.charAt(t))){
            t++;
        }
        String s1 = s.substring(0, t);
        int d = 0;
        if (s1.isEmpty()){
            d = 0;
        }else if (s1.equals("" + c1)){
            d = 1;
        }else if (s1.equals("" + c1 + c1)){
            d = 2;
        }else if (s1.equals("" + c1 + c1 + c1)){
            d = 3;
        }else if (s1.equals("" + c1 + c5)){
            d = 4;
        }else if (s1.equals("" + c5)){
            d = 5;
        }else if (s1.equals("" + c5 + c1)){
            d = 6;
        }else if (s1.equals("" + c5 + c1 + c1)){
            d = 7;
        }else if (s1.equals("" + c5 + c1 + c1 + c1)){
            d = 8;
        }else if (s1.equals("" + c1 + c10)){
            d = 9;
        }
        num += d * unit;
        return s.substring(t);
    }
    
}
```

[1]: https://oj.leetcode.com/problems/roman-to-integer/ "roman-to-integer"

