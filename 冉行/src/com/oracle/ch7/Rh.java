package com.oracle.ch7;

import java.io.File;
import java.io.IOException;

public class Rh {
		public static void main(String[] args) {
			File file=new File("d:"+"te"+File.separator+"se"+File.separator+"test5");
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
}
