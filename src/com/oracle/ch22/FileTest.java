package com.oracle.ch22;

import java.io.File;
import java.io.IOException;

/**
 * �ļ��Ĳ���
 * 
 * @author Administrator
 * 
 */
public class FileTest {
	public static void main(String[] args) {
		//����д��·����������·��
		String pathname = "E:\\java\\file\\file.txt";
		// ָ���ļ���·����E���µ�java�ļ����µ�file.txt����Ҫ���Ǵ����ġ�
		// "E:/java/file"
		File file = new File(pathname);
		//�����ļ�ʱ�������һ��IOException
		boolean flag=false;
		try {
			//����һ���ļ������ǿյ��ļ�
			flag=file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(flag);
		
	}
}







