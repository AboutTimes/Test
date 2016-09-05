package ch31;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL(
				"http://java.sun.com:8080/docs/books/tutorial/index.html#DOWN");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		String file = url.getFile();
		int port = url.getPort();
		String ref = url.getRef();
		System.out.println(protocol + "," + host + "," + file + "," + port
				+ "," + ref);
	}
}
