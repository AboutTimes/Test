package com.orcle.cha5;

public class Ate {
			public static void main(String[] args) {
				String geci="长亭外   古道边  芳草碧连天  晚风拂  柳笛声残  夕阳山外山";
				String []shbi=new String[100];
				System.out.println("****原歌词格式*****\n"+geci);
				System.out.println("\n****拆分后歌词****");
				shbi=geci.split("  ");
				for (int i = 0; i < shbi.length; i++) {
					System.out.println(shbi[i]);
				}
			}
}
