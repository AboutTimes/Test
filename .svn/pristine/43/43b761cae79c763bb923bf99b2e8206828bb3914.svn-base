package com.oracle.ch27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws Exception {
		String file="c:\\ts.txt";
		FileWriter fw=new FileWriter(file);
		//Ð´
		fw.write("ÄãºÃ£¬ÖØÇì");
		fw.close();
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		System.out.println(br.readLine());
		br.close();
	}
}
