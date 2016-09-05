package com.oracle.cha3;

import java.util.LinkedList;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class Node {
			public static void main(String[] args) {
				List list=new LinkedList();
				list.add("µÂÂê");
				list.add("¼ÎÎÄ");
				list.add("µÂ°î");
				for (int i = 0; i < list.size(); i++) {
					String str=(String) list.get(i);
					System.out.println(str);
				}
				
			}
}
