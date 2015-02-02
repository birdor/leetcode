## leetcode - Compare Version Numbers
- Time: 2015.01.18
- Tags: simuation

### Problem Description [link][1]
Compare two version numbers version1 and version1.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

>0.1 < 1.1 < 1.2 < 13.37

### Solution
```java
public class Solution {
    public int compareVersion(String version1, String version2) {
        int i, j;
        for(i = 0, j = 0; i < version1.length() || j < version2.length(); i++, j++){
            int v1 = 0, v2 = 0;
            while (i < version1.length() && version1.charAt(i) != '.'){
                v1 = v1 * 10 + version1.charAt(i++) - '0';
            }
            while (j < version2.length() && version2.charAt(j) != '.'){
                v2 = v2 * 10 + version2.charAt(j++) - '0';
            }
            if (v1 > v2){
                return 1;
            }
            if (v1 < v2){
                return -1;
            }
        }
        return 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/compare-version-numbers/ "compare-version-numbers"

