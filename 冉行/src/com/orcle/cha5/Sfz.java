package com.orcle.cha5;

import java.util.Scanner;

public class Sfz {
		
		public static void main(String[] args) {
			String sf;
			String sj;
			String zj;
			String f="n";
			Scanner sc=new Scanner(System.in);
			while(f.equals("n")){
				System.out.println("���������֤���룺");
				String str=sc.next();
				System.out.println("�������ֻ����룺");
				String str1=sc.next();
				System.out.println("�������������룺");
				String str2=sc.next();
				
				int i=str2.indexOf("-");
				
				String t=str2.substring(i+1);
				if((str.length()==16 || str.length()==18) && (str1.length()==11) && (i==4 && t.length()==7))
				{	System.out.println("ע��ɹ�");
					}else if((str.length()!=16 || str.length()!=18)){
						System.out.println("���֤���������16λ��18λ");
					}else if((str1.length()!=11)){
						System.out.println("�ֻ����������11λ");
					}else if((i!=4 && t.length()!=7)){
						System.out.println("�����������ű�����4λ��������7λ");
					}
				}
			
		}
}
			
			
		
			
	
				
			
		
			 
		
	
				
			
			 


