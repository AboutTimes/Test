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
		// �ֽ��� ���
		OutputStream os = new FileOutputStream("c:\\ts.txt", true);
		// ת����
		OutputStreamWriter ow = new OutputStreamWriter(os);
		// ������
		BufferedWriter bw = new BufferedWriter(ow);
		// д��Ϣ
		bw.write("www.oracle.com");
		bw.newLine();
		bw.write("www.oracle.com");
		// ����
		bw.close();
		// �ֽ���
		InputStream in = new FileInputStream("c:\\ts.txt");
		// ת����
		InputStreamReader ir = new InputStreamReader(in);
		// ������
		BufferedReader br = new BufferedReader(ir);
		String str = null;
		while ((str = br.readLine()) != null) {
			// ��
			System.out.println(str);
		}
		br.close();

	}
}
