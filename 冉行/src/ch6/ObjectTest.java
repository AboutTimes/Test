package ch6;

public class ObjectTest {
	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o);
		// 我们直接使用对象名时，默认输出的就是toString()方法
		// Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at
		// 标记符“@”和此对象哈希码的无符号十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于：
		// getClass().getName() + '@' + Integer.toHexString(hashCode())

		System.out.println(o.toString());
		// 十进制 0-9
		// 二进制1-0
		// 八进制0-7
		// 十六进制0-9 ABCDEF

		ObjectTest obj = new ObjectTest();
		System.out.println(obj);
	}

	@Override
	public String toString() {
		return "今天中午有人不吃饭";
	}
}
