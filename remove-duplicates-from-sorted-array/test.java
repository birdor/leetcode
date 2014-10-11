import java.util.Scanner;
import java.util.Arrays;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] a = new int[100];
		int n = 0;
		while (in.hasNextInt()){
			a[n++] = in.nextInt();
		}
		int[] b = Arrays.copyOf(a, n);
		int m = Solution.removeDuplicates(b);
		System.out.println(m);
	}
}