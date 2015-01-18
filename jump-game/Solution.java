/**
	leetcode - Jump Game
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.17
*/
public class Solution {
    public boolean canJump(int[] A) {
        int distance = 0;
        for (int i = 0; i < A.length; i++){
            if (i > distance){
                return false;
            }
            if (i + A[i] > distance){
                distance = i + A[i];
            }
        }
        return true;
    }
}