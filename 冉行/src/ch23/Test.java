package ch23;

//递归：就是方法自己调用自已
public class Test {
	public static void compute(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);
	}

	public static int compute1(int num) {
		System.out.println(num);
		// 定义一个变量用于计算
		int result = num;
		// 方法必须要有出口,也就是退出该方法
		// 判断当我们传入进来的num=1时，我们就退出该方法
		if (num == 1) {
			return 1;
		}
		return result + compute1(num - 1);
	}

	// 5*4*3*2*1


	  public static void main(String[] args) {
	 
		compute(5);
		int result = compute1(5);
		System.out.println(result);
	}
}

