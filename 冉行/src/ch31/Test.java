package ch31;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws Exception {
		// 读取网络资源
		URL url = new URL("http://localhost:8080/");
		// 打开一个输入流
		InputStream in = url.openStream();

		byte[] b = new byte[1024];
		// 定义一个长度
		int length = 0;
		OutputStream out = new FileOutputStream("e://tomcat.html", true);
		while (-1 != (length = in.read(b, 0, b.length))) {
			String str = new String(b, 0, length);
			// 写
			out.write(b, 0, length);
			System.out.println(str);
		}
		out.close();
		in.close();

	}
}
