package ch22;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		// 返回指定目录下的所有文件名
		String path = "c:\\windows";
		File file = new File(path);
		String list[] = file.list();
		// 得到指定目录下的相应文件，不是所有的文件
		for (String name : list) {
			// System.out.println(name);
		}
		File[] files = file.listFiles();
		for (File f : files) {
			// 这时需要输出名字
			System.out.println(f.getName());
		}

	}
}
