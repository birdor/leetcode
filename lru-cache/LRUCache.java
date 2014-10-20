/**
	leetcode - Lru Cache
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.20
*/
import java.util.*;
public class LRUCache{
    private class Node{
    	int key;
        int val;
        Node prev;
        Node next;
        public Node(int key, int val){
        	this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
    
	int capacity;
	int nodeNumber;
    Node head;
    Node tail;
    HashMap<Integer, Node> index;

    public LRUCache(int capacity){
    	this.capacity = capacity;
    	this.nodeNumber = 0;
        this.head = null;
        this.tail = null;
        this.index = new HashMap<Integer, Node>();
    }

    private void promote(int key){
    	if (!index.containsKey(key))
    		return;
    	Node i = index.get(key);
    	if (head != i){
    		if (tail == i){
    			tail = i.prev;
    		}
    		i.prev.next = i.next;
    		if (i.next != null)
    			i.next.prev = i.prev;
    		head.prev = i;
    		i.next = head;
    		head = i;
    	}
    }

    public void set(int key, int value){
    	if (!index.containsKey(key)){        	
    		Node tmp = new Node(key, value);
        	index.put(key, tmp);
        	if (nodeNumber > 0){
				head.prev = tmp;
				tmp.next = head;
				head = tmp;
        	}else{
				head = tail = tmp;        		
        	}
        	nodeNumber++;
        	if (nodeNumber > capacity){
        		removeTail();
        	}
    	}else{
    		index.get(key).val = value;
    		promote(key);
    	}
    }
    private void removeTail(){
    	if (nodeNumber > 0){
    		index.remove(tail.key);
    		if (tail.prev != null){
    			tail.prev.next = null;
    		}
    		tail = tail.prev;
    		head = (tail == null)? null : head;
    		nodeNumber--;
    	}
    }
    public int get(int key){
    	if (index.containsKey(key)){
    		promote(key);
    		return index.get(key).val;
    	}else{
    		return -1;
    	}
    }
    
}