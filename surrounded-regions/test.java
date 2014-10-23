import java.util.Scanner;

public class test{
	public static void main(String[] args){
		char[][] board = {
							{'X','X','O','X'},
							{'X','X','O','X'},
							{'X','O','X','O'},
							{'X','X','X','X'}
						};
		Solution so = new Solution();
		so.solve(board);
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[0].length; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}
