package com.oracle.ch20;

import java.io.File;
import java.io.IOException;

/**
 * check检查时异常
 * 
 * @author Administrator
 * 
 */
public class ExceptionTest3 {
	public static void main(String[] args) throws IOException {
		File file = new File("K:\\1.txt");
		// 检查时异常我们需要对其进行trycatch处理
		/*
		 * try { file.createNewFile(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		file.createNewFile();
	}
}
