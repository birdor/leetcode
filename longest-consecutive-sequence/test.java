import java.util.Scanner;

public class test{
	public static void main(String[] args){
		int[] num = new int[100];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++){
			num[i] = in.nextInt();
		}
		Solution so = new Solution();
		System.out.println(so.longestConsecutive(num));
	}
}
