package ch10;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 1类型 数组名[] =｛｝;
		// 2类型 数组名[] = new 类型[数组的大小];
		// 2.赋值:数组名[下标]=值对应我们的类型的;

		int[] array = { 3, 2, 5, 6, 0 };
		// 输出单个：数组名[下标]
		System.out.println(array[0]);
		// 输出所有的数组信息
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("+++++++++++++++++++");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				///int t = 1;
				System.out.println("内层"+j);

			}
			System.out.println("外层"+i);
		}

	}
}
