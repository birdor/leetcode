/**
	leetcode - Candy
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.08
*/
public class Solution {
    public int candy(int[] ratings) {
        int[] n = new int[ratings.length];
        
        for (int i = 1; i < ratings.length; i++)
            n[i] = (ratings[i] > ratings[i - 1])? n[i - 1] + 1 : 0;
        for (int i = ratings.length - 2; i >= 0; i--)
            n[i] = (ratings[i] > ratings[i + 1])? Math.max(n[i + 1] + 1, n[i]) : n[i];
            
        int sum = 0;
        for (int i = 0; i < ratings.length; i++)
            sum += n[i];

        return sum + ratings.length;
    }
}