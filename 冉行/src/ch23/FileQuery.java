package ch23;

import java.io.File;

/**
 * ��ѯ���е��ļ�
 * 
 * @author Administrator
 * 
 */
public class FileQuery {
	public static void main(String[] args) {
		File f = new File("E:\\test");
		query(f);
	}

	// ��Ҫ����һ���ļ�����
	public static void query(File file) {
		// �����ĳ���
		if (file.isFile() || file.list().length == 0) {
			// ����ļ�������
			//System.out.println(file.getName());
			return;
		} else {
			// ѭ���ļ�����
			File[] files = file.listFiles();
			for (File f : files) {
				// �ж��ǲ����ļ�
				if (f.isFile()) {
					System.out.println("\t" + f.getName());
				} else {
					System.out.println("\t" + f.getName() + "//");
				}
				// �������ǻ���Ҫ�ж��ǲ���Ŀ¼���±߻����ļ������ļ��С�
				if (f.isDirectory()) {
					// ����Ǿ͵����Լ��ķ���
					query(f);
				}

			}
		}

	}

}
