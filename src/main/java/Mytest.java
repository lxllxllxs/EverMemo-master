/**
 * Created by Administrator on 2016/4/23.
 */
public class Mytest {


	public static void main(String[] args) {
		new Mytest().go();
	}


	public void go() {
		if (4 > 3) {
			System.out.print("4bigerthan3");
			return;
		}
		System.out.print("continue");

	}
}