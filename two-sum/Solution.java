/**
	leetcode - Two Sum
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.01
*/
import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int[] index = new int[2];
        for (int i = 0; i < numbers.length; i++){
        	if (hash.containsKey(target - numbers[i])){
        		index[0] = hash.get(target - numbers[i]) + 1;
        		index[1] = i + 1;
        		break;
        	}
        	hash.put(numbers[i], i);
        }
        return index;
    }
}