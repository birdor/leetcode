import java.util.Scanner;
import java.util.ArrayList;


public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		Solution so = new Solution();
		while (in.hasNext()){
			int nrow = in.nextInt();
			ArrayList<ArrayList<Integer>> tri = so.generate(nrow);
			print(tri);
		}
	}
	private static void print(ArrayList<ArrayList<Integer>> tri){
		for (int i = 0; i < tri.size(); i++){
			for (int j = 0; j < tri.get(i).size(); j++){
				System.out.printf("%d ", tri.get(i).get(j));
			}
			System.out.print("\n");
		}
	}
}
