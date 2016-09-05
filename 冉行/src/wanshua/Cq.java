package wanshua;

import java.util.Random;

public class Cq {
			public static void main(String[] args) {
				String []a={"德玛和盖伦不是同一个人","德邦喜欢爆菊花","嘉文总是很操蛋","在将来的某一天，如果你失去我了，你会哭？","我想不会的"};
				Random r=new Random();
				System.out.println(a[r.nextInt(a.length)]);
			}
}
