package ch23;

import java.io.File;
import java.util.ArrayList;
   
/**
 * 给定任意一个目录，以树形方式展现出该目录中的所有子目录和文件。另外，在展现的时候将目录排在上面，文件排在下面。每一层要加上缩进。
 * 
 * @author Mountain
 * 
 */
public class FileTest9 {

	// 用于判断目录或文件所处的层次
	private static int time;

	public static void deepList(File file) {
		// 递归出口
		if (file.isFile() || 0 == file.listFiles().length) {
			return;
		} else {
			// 得到所有的目录和文件
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
	 * 整理文件数组，使得目录排在文件之前
	 */
	private static File[] sort(File[] files) {
		ArrayList<File> sorted = new ArrayList<File>();
		// 寻找所有的目录
		for (File f : files) {
			if (f.isDirectory()) {
				sorted.add(f);
			}
		}
		// 寻找所有的文件
		for (File f : files) {
			if (f.isFile()) {
				sorted.add(f);
			}
		}
		return sorted.toArray(new File[files.length]);
	}

	/**
	 * 判断需要加多少tab的方法
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
