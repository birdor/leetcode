/**
	leetcode - Word Ladder
	Time: O(n*l)
	Space: O(n*l)
	Completed: 2014.11.08
*/
public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        HashMap<String, Integer> dist = new HashMap<String, Integer>();
        LinkedList<String> queue = new LinkedList<String>();
        queue.add(start);
        dist.put(start, 1);
        while (queue.size() > 0){
            String s = queue.poll();
            int sn = dist.get(s);
            StringBuffer buf = new StringBuffer(s);
            for (int i = 0; i < s.length(); i++){
                char c = buf.charAt(i);
                for (int d = 0; d < 26; d++){
                    buf.setCharAt(i, (char)('a' + d));
                    String t = buf.toString();
                    if (t.equals(end)){
                        return sn + 1;
                    }
                    if (dict.contains(t) && !dist.containsKey(t)){
                        queue.add(t);
                        dist.put(t, sn + 1);
                    }
                }
                buf.setCharAt(i, c);
            }
        }
        return 0;
    }
}