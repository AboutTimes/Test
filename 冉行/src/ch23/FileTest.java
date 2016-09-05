package ch23;

import java.io.File;

/**
 * 删除指定目录中的所有文件
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
	 * 删除文件和目录
	 * 
	 * @param file
	 *            文件对象
	 */
	public static void deleteAll(File file) {
		// 需要找到出口方法
		// 需要判断是否是文件或者长度等于0
		//file.list().length==0表示下边没有文件
		if (file.isFile() || file.list().length==0) {
			file.delete();
		} else {
			// 得到所有文件：得到文件的数组
			File[] files = file.listFiles();
			// 调用自己的方法，递归
			for (File f : files) {
				// 把文件数组中的所有文件删除
				deleteAll(f);
			}
			// 需要删除自己
			file.delete();
		}
	}
}
