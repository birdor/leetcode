import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		LRUCache2 cache = new LRUCache2(2);
		while (in.hasNext()){
			String cmd = in.next();
			if (cmd.equals("get")){
				int key = in.nextInt();
				System.out.println(cache.get(key));
			}else{
				int key = in.nextInt();
				int val = in.nextInt();
				cache.set(key, val);
			}
		}
	}
}
