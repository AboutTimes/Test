package ch27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutPutStreamWriterTest {
	public static void main(String[] args) throws Exception {
		// 字节流 输出
		OutputStream os = new FileOutputStream("c:\\ts.txt", true);
		// 转换流
		OutputStreamWriter ow = new OutputStreamWriter(os);
		// 缓冲流
		BufferedWriter bw = new BufferedWriter(ow);
		// 写信息
		bw.write("www.oracle.com");
		bw.newLine();
		bw.write("www.oracle.com");
		// 关流
		bw.close();
		// 字节流
		InputStream in = new FileInputStream("c:\\ts.txt");
		// 转换流
		InputStreamReader ir = new InputStreamReader(in);
		// 缓冲流
		BufferedReader br = new BufferedReader(ir);
		String str = null;
		while ((str = br.readLine()) != null) {
			// 读
			System.out.println(str);
		}
		br.close();

	}
}
