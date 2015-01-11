## leetcode - Implement Strstr
- Time: 2014.12.06
- Tags: string

### Problem Description [link][1]
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

### Solution
```java
public class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length(), nlen = needle.length();
        if (nlen == 0){
            return 0;
        }
        int[] next = new int[nlen];
        next[0] = -1;
        for (int i = 1, j; i < nlen; i++){
            for (j = next[i - 1]; j >= 0 && needle.charAt(j) != needle.charAt(i - 1); j = next[j]);
            next[i] = j + 1;
        }
        for (int i = 0, j = 0; i < hlen; i++){
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j];
            }
            if (++j == nlen){
                return i - j + 1;
            }
        }
        return -1;
        
    }
}
```

[1]: https://oj.leetcode.com/problems/implement-strstr/ "implement-strstr"

