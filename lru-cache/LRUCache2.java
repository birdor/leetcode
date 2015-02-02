import java.util.*;

public class LRUCache2 {
    
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int k, int v){
            key = k;
            value = v;
            prev = null;
            next = null;
        }
    }
    
    Node head, tail;
    HashMap<Integer, Node> map;
    int maxSize;
    
    public LRUCache2(int capacity) {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.prev = tail;
        tail.next = head;
        map = new HashMap<Integer, Node>();
        maxSize = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)){
            return map.get(key).value;
        }else{
            return -1;
        }
    }
    
    private void insert(Node x){
        if (x != null){
            head.prev.next = x;
            x.prev = head.prev;
            x.next = head;
            head.prev = x;
            map.put(x.key, x);
        }
    }
    
    private void remove(Node x){
        if (x != null){
            x.prev.next = x.next;
            x.next.prev = x.prev;
            map.remove(x.key);
        }
    }
    
    public void set(int key, int value) {
        Node x = null;
        if (map.containsKey(key)){
            x = map.get(key);
            remove(x);
            x.value = value;
        }else{
            x = new Node(key, value);
            if (map.size() == maxSize){
                remove(tail.next);
            }
        }
        insert(x);
    }
}