package ch24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutPutStreamTest {
	public static void main(String[] args) throws Exception {
		// 1.����
		// 2.д��Ϣ
		// 3.�ر���

		// 1.�����ļ�
		File file = new File("c:\\test.doc");
		// �ж��ļ��Ƿ����
		if (!file.exists()) {
			file.createNewFile();
		}
		// ������� OutPutStream �����ļ�FileOutPutStream
		//true��ʾ�ڽ�β�������
		OutputStream out = new FileOutputStream(file,true);
		// д
		String str = "\n"+"eee";
		// ת��byte[]����
		byte[] b = str.getBytes();
		out.write(b, 0, b.length);
		//ǿ��д
		out.flush();
		// �ر���
		out.close();

	}

}
