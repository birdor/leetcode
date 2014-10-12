import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Solution so = new Solution();
		String s1 = in.next();
		String s2 = in.next();
		String s3 = in.next();
		System.out.println(so.isInterleave(s1, s2, s3));
	}
}
