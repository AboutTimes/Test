package com.oracle.ch31;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
	public static void main(String[] args) throws IOException {
		// 1.����һ��URL
		URL url = new URL("http://localhost:8080/");
		// 2.����һ��URLConnection
		URLConnection conn = url.openConnection();
		// 3.�õ�һ��������
		InputStream in = conn.getInputStream();
		// ���¾Ͱ���������Ĳ����Ϳ�����

	}
}
