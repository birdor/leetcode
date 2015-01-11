/**
	leetcode - Min Stack
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.09
*/
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
