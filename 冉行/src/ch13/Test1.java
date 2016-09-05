package ch13;

/**
 * 可变参数:方法传入的值可以动态
 * 
 * @author
 * 
 */
public class Test1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.add(1, 2, 3, 4, 5, 6, 6, 54, 4, 4, 3, 3, 2, 2);
		Person person = new Person("张三");
		Person person1 = new Person("李四");
		Person person2 = new Person("王五");
		Person person3 = new Person("李小龙");
		Person person4 = new Person("成龙");
		test1.add(person, person1, person2, person3, person4);
		
	}

	/**
	 * 可变参数的方法 int... i其实他就是一个数组 如果
	 * 
	 * @param i
	 */
	public void add(int... i) {
		// 我们操作时就以数组的方式去操作
		for (int j : i) {
			System.out.println(j);
		}
	}

	/**
	 * 使用引用类型做为可变参数
	 * 
	 * @param persons
	 */
	public void add(Person... persons) {
		for(Person p:persons){
			System.out.println(p.name);
		}
	}

}
