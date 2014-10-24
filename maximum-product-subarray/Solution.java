/**
	leetcode - Maximum Product Subarray
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.23
*/
public class Solution {
    public int maxProduct(int[] A) {
        long ans = -Long.MIN_VALUE;
        int i = 0, j = 0;
        for (i = 0; i < A.length; i++){
            if (A[i] == 0){
                if (j < i){
                    ans = Math.max(ans, product(A, j, i));
                }
                j = i + 1;
                ans = Math.max(ans, 0);
            }
        }
        if (j < i){
            ans = Math.max(ans, product(A, j, i));
        }
        return (int)ans;
    }
    public long product(int[] A, int s, int e){
        if (e - s == 1){
            return A[s];
        }
        long prod = 1;
        for (int i = s; i < e; i++)
            prod *= A[i];
        if (prod < 0){
            long leftProd = 1, rightProd = 1;
            for (int i = s; i < e && leftProd > 0; i++)
                leftProd *= A[i];
            for (int i = e - 1; i >= s && rightProd > 0; i--){
                rightProd *= A[i];
            }
            prod = Math.max(prod/leftProd, prod/rightProd);
        }
        return prod;
    }
    
    
}