package ch23;

import java.io.File;
import java.util.ArrayList;
   
/**
 * ��������һ��Ŀ¼�������η�ʽչ�ֳ���Ŀ¼�е�������Ŀ¼���ļ������⣬��չ�ֵ�ʱ��Ŀ¼�������棬�ļ��������档ÿһ��Ҫ����������
 * 
 * @author Mountain
 * 
 */
public class FileTest9 {

	// �����ж�Ŀ¼���ļ������Ĳ��
	private static int time;

	public static void deepList(File file) {
		// �ݹ����
		if (file.isFile() || 0 == file.listFiles().length) {
			return;
		} else {
			// �õ����е�Ŀ¼���ļ�
			File[] files = file.listFiles();
			files = sort(files);
			for (File f : files) {
				StringBuffer output = new StringBuffer();
				if (f.isFile()) {
					output.append(getTabs(time));
					output.append(f.getName());
				} else {
					output.append(getTabs(time));
					output.append(f.getName());
					output.append("\\");
				}
				System.out.println(output);
				if (f.isDirectory()) {
					time++;
					deepList(f);
					time--;
				}
			}
		}
	}

	/**
	 * �����ļ����飬ʹ��Ŀ¼�����ļ�֮ǰ
	 */
	private static File[] sort(File[] files) {
		ArrayList<File> sorted = new ArrayList<File>();
		// Ѱ�����е�Ŀ¼
		for (File f : files) {
			if (f.isDirectory()) {
				sorted.add(f);
			}
		}
		// Ѱ�����е��ļ�
		for (File f : files) {
			if (f.isFile()) {
				sorted.add(f);
			}
		}
		return sorted.toArray(new File[files.length]);
	}

	/**
	 * �ж���Ҫ�Ӷ���tab�ķ���
	 * 
	 * @param args
	 */
	private static String getTabs(int time) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < time; i++) {
			buffer.append("\t");
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		deepList(new File("E:\\adt-bundle-windows-x86-20130729"));
	}
}
