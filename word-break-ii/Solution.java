/**
	leetcode - Word Break Ii
	Time: O(n) ~ O(k^n)
	Space: O(n) ~ O(k^n)
	Completed: 2015.1.17
*/
public class Solution {
    List<String> sentences = null;
    StringBuffer buffer = null;
    
    class LinkedNode{
        int pos;
        LinkedNode next;
        public LinkedNode(int pos, LinkedNode next){
            this.pos = pos;
            this.next = next;
        }
    }
    
    private void breakword(String s, int pos, LinkedNode[] link){
        if (pos == link.length){
            buffer.delete(buffer.length() - 1, buffer.length());
            sentences.add(buffer.toString());
            buffer.append(' ');
            return;
        }
        for (LinkedNode i = link[pos]; i != null; i = i.next){
            int len = i.pos - pos;
            buffer.append(s.substring(pos, pos + len));
            buffer.append(' ');
            breakword(s, i.pos, link);
            buffer.delete(buffer.length() - len - 1, buffer.length());
        }
    }
    
    public List<String> wordBreak(String s, Set<String> dict) {
        int n = s.length();
        LinkedNode[] link = new LinkedNode[n];
        int[] inDeg = new int[n];
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                if (dict.contains(s.substring(j, i))){
                    link[j] = new LinkedNode(i, link[j]);
                    inDeg[i - 1]++;
                }
            }
        }
        sentences = new LinkedList<String>();
        buffer = new StringBuffer();
        if (inDeg[n - 1] > 0){
            breakword(s, 0, link);  
        }
        return sentences;
    }
}