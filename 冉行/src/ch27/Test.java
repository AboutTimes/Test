package ch27;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws Exception {
		OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream(
				"c:\\ts.txt"));
		ow.write("ÖÐ¹ú");
		ow.close();

		InputStream in = new FileInputStream("c:\\ts.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		System.out.println(br.readLine());

	}
}
