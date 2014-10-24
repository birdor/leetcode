import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Solution so = new Solution();
		while (in.hasNextInt()){
			System.out.println(so.divide(in.nextInt(), in.nextInt()));
		}
	}
}
