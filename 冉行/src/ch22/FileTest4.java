package ch22;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest4 {
	public static void main(String[] args) {
		File file = new File("E:\\javase\\5.10��");
		// ��Ҫʹ���ڲ���ķ�ʽʵ��
		String[] files = file.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				if (name.endsWith(".java")) {
					
					return true;
				}
				return false;
			}
		});
		
		for(String str:files){
			System.out.println(str);
		}
		
	
}
}
