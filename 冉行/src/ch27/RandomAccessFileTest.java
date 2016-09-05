package ch27;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		// rw读写
		RandomAccessFile wr = new RandomAccessFile("c:\\ts.txt", "rw");
		//写信息
		wr.writeUTF("你好，小朋友");
		wr.close();
		RandomAccessFile wrs = new RandomAccessFile("c:\\ts.txt", "rw");
		//读
		String str=wrs.readUTF();
		System.out.println(str);
		wrs.close();
		//该对象，如果是写就只能写，是读就只能读
		
	}
}
