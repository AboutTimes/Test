package ch22;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		// ����ָ��Ŀ¼�µ������ļ���
		String path = "c:\\windows";
		File file = new File(path);
		String list[] = file.list();
		// �õ�ָ��Ŀ¼�µ���Ӧ�ļ����������е��ļ�
		for (String name : list) {
			// System.out.println(name);
		}
		File[] files = file.listFiles();
		for (File f : files) {
			// ��ʱ��Ҫ�������
			System.out.println(f.getName());
		}

	}
}
