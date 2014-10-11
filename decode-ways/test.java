import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Solution so = new Solution();
		System.out.println(so.numDecodings(""));
		while (in.hasNext()){
			String s = in.next();
			System.out.println(so.numDecodings(s));
		}
	}
}
