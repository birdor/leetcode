/**
	leetcode - Copy List With Random Pointer
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.03
*/
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode hook = new RandomListNode(0);
        for (RandomListNode i = head, j = hook; i != null; i = i.next){
            j.next = new RandomListNode(i.label);
            j = j.next;
            map.put(i, j);
        }
        for (RandomListNode i = head, j; i != null; i = i.next){
            j = map.get(i);
            j.random = map.get(i.random);
        }
        return hook.next;
    }
}