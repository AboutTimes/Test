package com.oracle.ch22;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 
 * @author Mountain
 * 
 */
public class FileTest7 {
	public static void main(String[] args) {
		// ���� File����
		// File.separator��ʾ��
		//��������ǵĹ����ռ�
		File file = new File(File.separator);
		File file1 = new File(file, "test.txt");
		try {
			System.out.println(file1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
