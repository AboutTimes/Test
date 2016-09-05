package wanshua;

import java.util.Random;

public class Sazi {
	public static void main(String[] args) {
		int []b={1,2,3,4,5,6};
		Random a=new Random();
		System.out.print(a.nextInt(b.length)+1 );
		System.out.print(a.nextInt(b.length)+1);
		System.out.println(a.nextInt(b.length)+1);
	}
}
