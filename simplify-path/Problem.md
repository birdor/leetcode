## leetcode - Simplify Path
- Time: 2014.11.04
- Tags: string

### Problem Description [link][1]
Given an absolute path for a file (Unix-style), simplify it.

For example,
`path = "/home/"`, => `"/home"`
`path = "/a/./b/../../c/"`, => `"/c"`

### Solution
```java
public class Solution {
    public String simplifyPath(String path) {
        String[] dir = path.split("/");
        int t = 0; // top of the stack
        for (String s : dir){
            if (s.equals(".") || s.isEmpty()){
                // do nothing
            }else if (s.equals("..")){
                if (t > 0) t--;
            }else{
                dir[t++] = s;
            }
        }
        StringBuffer absPathBuffer = new StringBuffer(path.length());
        for (int i = 0; i < t; i++){
            absPathBuffer.append("/" + dir[i]);
        }
        path = absPathBuffer.toString();
        return (path.isEmpty())? "/" : path;
    }
}
```

[1]: https://oj.leetcode.com/problems/simplify-path/ "simplify-path"

