package ch23;

import java.io.File;

/**
 * ɾ��ָ��Ŀ¼�е������ļ�
 * 
 * @author Administrator
 * 
 */
public class FileTest {
	public static void main(String[] args) {
		File f = new File("E:\\java");
		deleteAll(f);
	}
	/**
	 * ɾ���ļ���Ŀ¼
	 * 
	 * @param file
	 *            �ļ�����
	 */
	public static void deleteAll(File file) {
		// ��Ҫ�ҵ����ڷ���
		// ��Ҫ�ж��Ƿ����ļ����߳��ȵ���0
		//file.list().length==0��ʾ�±�û���ļ�
		if (file.isFile() || file.list().length==0) {
			file.delete();
		} else {
			// �õ������ļ����õ��ļ�������
			File[] files = file.listFiles();
			// �����Լ��ķ������ݹ�
			for (File f : files) {
				// ���ļ������е������ļ�ɾ��
				deleteAll(f);
			}
			// ��Ҫɾ���Լ�
			file.delete();
		}
	}
}
