package ch27;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		// rw��д
		RandomAccessFile wr = new RandomAccessFile("c:\\ts.txt", "rw");
		//д��Ϣ
		wr.writeUTF("��ã�С����");
		wr.close();
		RandomAccessFile wrs = new RandomAccessFile("c:\\ts.txt", "rw");
		//��
		String str=wrs.readUTF();
		System.out.println(str);
		wrs.close();
		//�ö��������д��ֻ��д���Ƕ���ֻ�ܶ�
		
	}
}
