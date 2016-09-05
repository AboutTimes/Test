package ch9;

public class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public static void main(String[] args) {
		Person person[] = new Person[5];
		for (int i = 0; i < person.length; i++) {
			Person p = new Person("张三" + i);
			person[i] = p;
		}
		for (int i = 0; i < person.length; i++) {
			// System.out.println(person[i].name);
			// 1.先使用Person来接收
			Person p = person[i];
			System.out.println(p.name);
		}
		// 【1】一个人有N多只CAT：
		// 要求接收用户的输入 cat中最少有一个方法和属性int类型的比如年龄
		
		// [2]对整型数组排序
		//示例：int []array={5,2,6,8,2};
		//排序后的结果为;2,2,5,6,8
		
		// 【3】一个人有N多只CAT：
		// 要求接收用户的输入 cat中最少有一个方法和属性int类型的比如年龄
		//在输出Cat里根据年龄大小来输出
	}

}
