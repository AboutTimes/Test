package ch11;

public class Test1Single {
	public static void main(String[] args) {
		//˽�еķ��������������������ǲ��ܵ��õ�
		//Si si=new Si();
		//
		Si si=Si.getSi();
		Si si1=Si.getSi();
		Si si2=Si.getSi();
		Si si3=Si.getSi();
		
		System.out.println(si);
		System.out.println(si==si1&&si2==si3);
		
	}
}
