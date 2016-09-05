package com.oracle.ch9;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import ch26.B;
import ch26.C;
import ch26.D;
import ch26.E;

public class Client {
		public static void main(String[] args) {
			C b1 = new C(new D(new E(new B())));
			
			b1.a();

				/**InputStream input = 
						new BufferedInputStream(
						new DataInputStream(
						new FileInputStream(
						new File("d:\\t.txt"))));
						*/
		}
}
