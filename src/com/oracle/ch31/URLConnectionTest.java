package com.oracle.ch31;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
	public static void main(String[] args) throws IOException {
		// 1.创建一个URL
		URL url = new URL("http://localhost:8080/");
		// 2.创建一个URLConnection
		URLConnection conn = url.openConnection();
		// 3.得到一个输入流
		InputStream in = conn.getInputStream();
		// 以下就按输入的流的操作就可以那

	}
}
