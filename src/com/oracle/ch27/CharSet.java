package com.oracle.ch27;

import java.util.Properties;

public class CharSet {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.list(System.out);
	}

}