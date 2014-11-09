/**
	leetcode - Length Of Last Word
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.07
*/
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--){
            if (words[i].length() > 0){
                return words[i].length();
            }
        }
        return 0;
    }
}