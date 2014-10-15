import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int alen = in.nextInt(), blen = in.nextInt();
		int[] A = new int[alen];
		int[] B = new int[blen];
		for (int i = 0; i < alen; i++) 
			A[i] = in.nextInt();
		for (int i = 0; i < blen; i++) 
			B[i] = in.nextInt();

		Solution so = new Solution();
		double ans = so.getKth(in.nextInt(), A, 0, A.length, B, 0, B.length);
		System.out.println(ans);
		// System.out.println(so.findMedianSortedArrays(A, B));
	}
}
