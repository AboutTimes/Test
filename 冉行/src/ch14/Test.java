package ch14;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//需要操作基本数据类型时，可以使用包装类
		Integer integer=new Integer("123");
		//把一个Integer包装类转成int类类型
		int i=integer.intValue();
		System.out.println(i);
		//Integer包装类 对应的是 int
		//Short short
		//Long long
		//Float float
		//Double double
		//Boolean boolean
		//Character char
		//Byte byte
		String str="";
		str.length();
		
		//把一个字符数组转换成一个字符串
		char[] ch={'张','李','王'};
		//1
		String str1=new String(ch);
		System.out.println(str1);
		
		//2通过调用String中的方法 
		String str2=String.valueOf(ch);
		System.out.println(str2);
	}

}
