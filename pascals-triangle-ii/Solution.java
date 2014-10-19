/**
	leetcode - Pascals Triangle Ii
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.19
*/
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int n = 0; n <= rowIndex; n++){
            row.add(0, 1);
            for (int i = 1; i <= n/2; i++){
                row.set(i, row.get(n - i) + row.get(n - i + 1));
            }
            for (int i = n/2 + 1; i <= n; i++){
                row.set(i, row.get(n - i));
            }
        }
        return row;
    }
}