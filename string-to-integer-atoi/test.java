import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println("input: \n" + input);
		Solution converter = new Solution();
		int x = converter.atoi(input);
		System.out.println("output: \n" + x);
	}
}