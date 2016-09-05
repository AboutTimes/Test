package com.oracle.ch22;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		//ָ��·��
		String path="E:\\java\\file\\test.java";
		//����File����
		File file =new File(path);
		//�����ļ�
		file.createNewFile();
		//�����ļ�������
		System.out.println(file.getName());
		//�����ļ��ĸ���
		System.out.println(file.getParent());
		//���أ��Ƿ��Ǿ���·��
		System.out.println("�Ƿ��Ǿ���·�� :"+file.isAbsolute());
		System.out.println("�ж��Ƿ���Ŀ¼"+file.isDirectory());
		System.out.println("�Ƿ����ļ�"+file.isFile());
		//�ж��ļ��Ƿ����
		System.out.println(file.exists());
		//ɾ���ļ�
		System.out.println(file.delete());//�ж��ļ��Ƿ����
		//�ж��ļ��Ƿ����
		System.out.println(file.exists());
		
	}
}
