package ch31;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws Exception {
		// ��ȡ������Դ
		URL url = new URL("http://localhost:8080/");
		// ��һ��������
		InputStream in = url.openStream();

		byte[] b = new byte[1024];
		// ����һ������
		int length = 0;
		OutputStream out = new FileOutputStream("e://tomcat.html", true);
		while (-1 != (length = in.read(b, 0, b.length))) {
			String str = new String(b, 0, length);
			// д
			out.write(b, 0, length);
			System.out.println(str);
		}
		out.close();
		in.close();

	}
}
