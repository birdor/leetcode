import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] testdata = {1,2,4,2,5,7,2,4,9,0};
		Solution so = new Solution();
		System.out.println(so.maxProfit(testdata));
	}
}
