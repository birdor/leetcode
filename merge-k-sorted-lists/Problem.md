## leetcode - Merge K Sorted Lists
- Time: 2015.01.21
- Tags: heap, linked list

### Problem Description [link][1]
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

### Solution
```java
public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
        SmallListNodeHeap heap = new SmallListNodeHeap(list.size());
        ListNode anchor = new ListNode(0), it = anchor;
        for (ListNode node : lists){
            heap.push(node);
        }
        while (heap.size() > 0){
            ListNode node = heap.pop();
            it.next = node;
            it = node;
            heap.push(node.next);
        }
        return anchor.next;
    }
}
class SmallListNodeHeap{
    private int size;
    ListNode[] data;
    public SmallListNodeHeap(int capab){
        data = new ListNode[capab];
        size = 0;
    }
    public int size(){
        return size;
    }
    public void push(ListNode x){
        if (x != null){
            data[size++] = x;
            siftUp(size - 1);
        }
    }
    public ListNode pop(){
        if (size == 0){
            return null;
        }
        ListNode node = data[0]; 
        data[0] = data[--size];
        siftDown(0);
    }
    private void swap(int i, int j){
        ListNode tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
    private void siftUp(int k){
        while (k > 0){
            int pk = (k - 1) / 2;
            if (data[pk].val > data[k].val){
                swap(pk, k);
                k = pk;
            }else{
                return;
            }
        }
    }
    private void siftDown(int k){
        while (k < size){
            int l = k * 2 + 1, r = l + 1, t = k;
            if (l < size && data[l].val < data[k].val){
                t = l;
            }
            if (r < size && data[r].val < data[k].val && data[r].val < data[l].val){
                t = r;
            }
            if (k != t){
                swap(t, k);
            }else{
                return;
            }
        }
    }
    
}
```

[1]: https://oj.leetcode.com/problems/merge-k-sorted-lists/ "merge-k-sorted-lists"

