package ch24;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//�������������Ĺ���{������}
public class InPutStreamTest3 {
	public static void main(String[] args) throws Exception {

		// InputStream input = new FileInputStream(file);
		// ��Ҫ��ӻ���Ĺ���
		// InputStream input =new BufferedInputStream(new
		// FileInputStream(file));
		File file = new File("c:\\test.doc");
		// �ļ�������
		FileInputStream in = new FileInputStream(file);
		// �����幦�ܵ�������
		InputStream input = new BufferedInputStream(in);
		// �ϲ���һ���д��
		// InputStream inputs = new BufferedInputStream(new FileInputStream(new
		// File("c:\\test.doc")));

		byte[] b = new byte[1000];
		int length = 0;
		while (-1 != (length = input.read(b, 0, b.length))) {
			String str = new String(b, 0, length);
			System.out.println(str);
		}

	}
}
