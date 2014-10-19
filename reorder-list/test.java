import java.util.Scanner;

public class test{
	public static void main(String[] args){
		ListNode x = new ListNode(1);
		x.next = new ListNode(2);
		x.next.next = new ListNode(3);
		Solution so = new Solution();
		so.reorderList(x);
		System.out.println(x.val);
		System.out.println(x.next.val);
		System.out.println(x.next.next.val);
	}
}
