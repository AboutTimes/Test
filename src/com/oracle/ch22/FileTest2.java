package com.oracle.ch22;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		// ����Ŀ¼
		String pathname = "E:\\java\\file\\test\\t\\t\\t";
		File file = new File(pathname);
		// ����Ŀ¼:���Ǵ�����һ��Ŀ¼
		// file.mkdir();
		// ����Ҫͬʱ�������Ŀ¼��ô��
		// file.mkdirs();
		// File files=new File("java");
		// files.mkdir();
		// files.delete();
		System.out.println(file.delete());
		// ������ɾ���ļ������ļ���ʱ������±����ļ�����Ŀ¼�ǲ�ɾ����
	}

}