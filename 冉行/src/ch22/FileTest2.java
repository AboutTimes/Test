package ch22;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		// 创建目录
		String pathname = "d:\\te\\se\\test1";
		File file = new File(pathname);
		// 创建目录:这是创建的一个目录
		// file.mkdir();
		// 你需要同时创建多个目录怎么办
		// file.mkdirs();
		// File files=new File("java");
		// files.mkdir();
		// files.delete();
		System.out.println(file.delete());
		// 我们在删除文件或者文件夹时，如果下边有文件或者目录是不删除的
	}

}
