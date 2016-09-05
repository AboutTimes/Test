package ch10;

public class Cat {
	// 【1】一个人有N多只CAT：
	// 要求接收用户的输入 cat中
	// 最少有一个方法和属性int类型的比如年龄
	int age;
	String name;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "猫的名字" + this.name + "猫的年龄：" + this.age;
	}
}
