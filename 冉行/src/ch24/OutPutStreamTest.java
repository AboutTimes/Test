package ch24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutPutStreamTest {
	public static void main(String[] args) throws Exception {
		// 1.打开流
		// 2.写信息
		// 3.关闭流

		// 1.创建文件
		File file = new File("c:\\test.doc");
		// 判断文件是否存在
		if (!file.exists()) {
			file.createNewFile();
		}
		// 打开输出流 OutPutStream 操作文件FileOutPutStream
		//true表示在结尾添加内容
		OutputStream out = new FileOutputStream(file,true);
		// 写
		String str = "\n"+"eee";
		// 转成byte[]数组
		byte[] b = str.getBytes();
		out.write(b, 0, b.length);
		//强制写
		out.flush();
		// 关闭流
		out.close();

	}

}
