package ch23;

import java.io.File;

/**
 * 查询所有的文件
 * 
 * @author Administrator
 * 
 */
public class FileQuery {
	public static void main(String[] args) {
		File f = new File("E:\\test");
		query(f);
	}

	// 需要传入一个文件对象
	public static void query(File file) {
		// 方法的出口
		if (file.isFile() || file.list().length == 0) {
			// 输出文件的名字
			//System.out.println(file.getName());
			return;
		} else {
			// 循环文件数组
			File[] files = file.listFiles();
			for (File f : files) {
				// 判断是不是文件
				if (f.isFile()) {
					System.out.println("\t" + f.getName());
				} else {
					System.out.println("\t" + f.getName() + "//");
				}
				// 这里我们还需要判断是不是目录【下边还有文件或者文件夹】
				if (f.isDirectory()) {
					// 如果是就调用自己的方法
					query(f);
				}

			}
		}

	}

}
