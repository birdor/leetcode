## leetcode - Min Stack
- Time: 2014.11.09
- Tags: stack

### Problem Description [link][1]
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

- `push(x)` -- Push element x onto stack.
- `pop()` -- Removes the element on top of the stack.
- `top()` -- Get the top element.
- `getMin()` -- Retrieve the minimum element in the stack.

### Solution
```java
class MinStack {
    class Node {
        int value;
        int minSoFar;
        Node next;
    }
    
    private Node top = null;
    
    public void push(int x) {
        Node p = new Node();
        p.value = x;
        p.minSoFar = (top != null) ? Math.min(x, top.minSoFar) : x;
        p.next = top;
        top = p;
    }

    public void pop() {
        top = (top != null) ? top.next : null;
    }

    public int top() {
        return (top != null) ? top.value : 0;
    }

    public int getMin() {
        return (top != null) ? top.minSoFar : 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/min-stack/ "min-stack"

