package com.orcle.cha5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Hashset {
			public static void main(String[] args) {
				Set set=new HashSet();
				set.add("1");
				set.add("2");
				set.add("3");
				set.add("4");
				set.add("5");
				set.add("6");
				set.add("7");
				
				System.out.println(set.size());
				System.out.println(set.isEmpty());
				Iterator it=set.iterator();
				System.out.println(it.hasNext());
				while(it.hasNext()){
					Object obj=it.next();
					System.out.println(obj);
				}
			}
}
