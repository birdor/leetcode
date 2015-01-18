/**
	leetcode - Jump Game Ii
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.17
*/
public class Solution {
    public int jump(int[] A) {
        int dist = 0, steps = 0;
        for (int i = 0; dist < A.length - 1 && i <= dist; steps++){
            for (int fence = dist; i <= fence && i < A.length; i++){
                dist = Math.max(dist, i + A[i]);
            }
        }
        return (dist >= A.length - 1)? steps : 0;
    }
}