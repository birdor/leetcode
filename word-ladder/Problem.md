## leetcode - Word Ladder
- Time: 2014.11.08
- Tags: string, hash map, breadth first search

### Problem Description [link][1]
Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:

Only one letter can be changed at a time.
Each intermediate word must exist in the dictionary.
For example,

Given:
start = `"hit"`,
end = `"cog"`,
dict = `["hot","dot","dog","lot","log"]`,
As one shortest transformation is `"hit" -> "hot" -> "dot" -> "dog" -> "cog"`,
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.

### Solution
```java
public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        HashMap<String, Integer> dist = new HashMap<String, Integer>();
        LinkedList<String> queue = new LinkedList<String>();
        queue.add(start);
        dist.put(start, 1);
        while (queue.size() > 0){
            String s = queue.poll();
            int sn = dist.get(s);
            StringBuffer buf = new StringBuffer(s);
            for (int i = 0; i < s.length(); i++){
                char c = buf.charAt(i);
                for (int d = 0; d < 26; d++){
                    buf.setCharAt(i, (char)('a' + d));
                    String t = buf.toString();
                    if (t.equals(end)){
                        return sn + 1;
                    }
                    if (dict.contains(t) && !dist.containsKey(t)){
                        queue.add(t);
                        dist.put(t, sn + 1);
                    }
                }
                buf.setCharAt(i, c);
            }
        }
        return 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/word-ladder/ "word-ladder"

