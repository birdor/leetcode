## leetcode - Lru Cache
- Time: 2014.10.20
- Tags: linked list, hash table

### Problem Description [link][1]
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.


### Solution


```java
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
```

[1]: https://oj.leetcode.com/problems/lru-cache/ "lru-cache"

