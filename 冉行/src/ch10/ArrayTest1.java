package ch10;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 1���� ������[] =����;
		// 2���� ������[] = new ����[����Ĵ�С];
		// 2.��ֵ:������[�±�]=ֵ��Ӧ���ǵ����͵�;

		int[] array = { 3, 2, 5, 6, 0 };
		// ���������������[�±�]
		System.out.println(array[0]);
		// ������е�������Ϣ
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
				System.out.println("�ڲ�"+j);

			}
			System.out.println("���"+i);
		}

	}
}
