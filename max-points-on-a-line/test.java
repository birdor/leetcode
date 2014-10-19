import java.util.*;

public class test{
	public static void main(String[] args){
		Solution so = new Solution();
		Point p[] = new Point[132];
		Scanner in = new Scanner(System.in);
		int n = 0;
		while (in.hasNextInt()){
			int x = in.nextInt();
			int y = in.nextInt();
			p[n++] = new Point(x, y);
		}
		System.out.println(so.maxPoints(p));
	}
}
