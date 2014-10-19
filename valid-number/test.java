import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Solution so = new Solution();
		Scanner in = new Scanner(System.in);
		// System.out.println(so.isNumber(in.next()));
		while (in.hasNext()){
			String s = in.nextLine();
			// String x[] = s.split("\\.");
			// System.out.println(x.length);
			// for (int i = 0; i < x.length; i++)
			// 	System.out.println(i + ": " + x[i]);
			System.out.println(so.isNumber(s));
		}
	}
}
