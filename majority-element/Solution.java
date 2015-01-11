/**
	leetcode - Majority Element
	Time: 
	Space: 
	Completed:
*/
public class Solution {
    public int majorityElement(int[] num) {
        for (int i = 1, j = 1; j < num.length; i++){
            if (num[i] == num[i - 1]){
                while (j < num.length && num[j] == num[i]){
                    j++;
                }
                if (j < num.length){
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }else{
                j++;
            }
        }
        return num[num.length - 1];
    }
}