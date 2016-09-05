package ch11;

public class Test1Single {
	public static void main(String[] args) {
		//私有的方法和属性在其他类中是不能调用的
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
