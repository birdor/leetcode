import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Solution so = new Solution();
		int n = in.nextInt(), k = in.nextInt();
		ArrayList<ArrayList<Integer>> list = so.combine(n, k);
		for (int i = 0; i < list.size(); i++){
			for (int j = 0; j < list.get(i).size(); j++){
				System.out.printf("%3d", list.get(i).get(j));
			}
			System.out.print("\n");
		}
	}
}
