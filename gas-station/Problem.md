## leetcode - Gas Station
- Time: 2014.10.21
- Tags: greedy

### Problem Description [link][1]
There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

Note:
The solution is guaranteed to be unique.

### Solution
```java
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, sum = 0, j = n - 1;
        for (int i = 0; i <= j; i++){
            sum += gas[i] - cost[i];
            while (sum < 0 && i < j){
                sum += gas[j] - cost[j];
                j = (j - 1 + n) % n;
            }
        }
        return (sum >= 0)? (j + 1) % n : -1;
    }
}
```

[1]: https://oj.leetcode.com/problems/gas-station/ "gas-station"

