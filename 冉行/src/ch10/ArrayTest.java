package ch10;

public class ArrayTest {
	public static void main(String[] args) {
		// 1���� ������[] =����;
		// 2���� ������[] = new ����[����Ĵ�С];
		// 2.��ֵ:������[�±�]=ֵ��Ӧ���ǵ����͵�;

		int[] array = { 3, 2, 3, 4, 3, 2 };
		// ���������������[�±�]
		System.out.println(array[0]);
		// ������е�������Ϣ
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