import java.util.Scanner;

public class test{
	public static void main(String[] args){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;

		c = (a = b).next;

		System.out.printf("%d %d %d\n", a.val, b.val, c.val);
	}
}
