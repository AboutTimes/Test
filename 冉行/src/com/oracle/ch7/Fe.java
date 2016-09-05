package com.oracle.ch7;

import java.io.File;

public class Fe {
		public static void main(String[] args) {
			File file=new File("d:"+File.separator+"fx");
			file.delete();
		}
}
