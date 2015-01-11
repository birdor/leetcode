## leetcode - Gray Code
- Time: 2015.01.11
- Tags: 

### Problem Description [link][1]

The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
```
00 - 0
01 - 1
11 - 3
10 - 2
```
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.

### Solution
```java
public class Solution {
    public List<Integer> grayCode(int n) {
        LinkedList<Integer> ans = new LinkedList<Integer>();
        ans.add(0);
        for (int i = 0, k = 1; i < n; k <<= 1, i++){
            LinkedList<Integer> tmp = (LinkedList<Integer>) ans.clone();
            for (Iterator<Integer> it = tmp.descendingIterator(); it.hasNext(); ){
                ans.add(it.next() + k);
            }
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/gray-code/ "gray-code"

