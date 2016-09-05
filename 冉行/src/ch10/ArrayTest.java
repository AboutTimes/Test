package ch10;

public class ArrayTest {
	public static void main(String[] args) {
		// 1类型 数组名[] =｛｝;
		// 2类型 数组名[] = new 类型[数组的大小];
		// 2.赋值:数组名[下标]=值对应我们的类型的;

		int[] array = { 3, 2, 3, 4, 3, 2 };
		// 输出单个：数组名[下标]
		System.out.println(array[0]);
		// 输出所有的数组信息
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("+++++++++++++++++++");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				//System.out.println(j);
			}
			//System.out.println(i);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		
		}

	}

}