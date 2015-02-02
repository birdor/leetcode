/**
	leetcode - Merge K Sorted Lists
	Time: O(NlogK)
	Space: O(K)
	Completed: 2015.1.21
*/
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<ListNode> lists = new ArrayList<ListNode>(N);
		for (int i = 0; i < N; i++){
			int k = in.nextInt();
			lists.add(null);
			for (int j = 0; j < k; j++){
				int x = in.nextInt();
				lists.set(i, new ListNode(x, lists.get(i)));
			}
		}
		Solution so = new Solution();
		ListNode node = so.mergeKLists(lists);
		for (ListNode i = node; i != null; i = i.next){
			System.out.print(i.val + " -> ");
		}
		System.out.println("*");
	}
    public ListNode mergeKLists(List<ListNode> lists) {
        SmallListNodeHeap heap = new SmallListNodeHeap(lists.size());
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
    public String toString(){
    	String s = "";
    	for (int i = 0; i < size; i++){
    		s += data[i].val + " ";
    	}
    	return s;
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
        return node;
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
                k = t;
            }else{
                return;
            }
        }
    }
    
}