package com.oracle.ch5;

/**
 * 我们定义属性时都需要设置他的访问修饰 注意：我们写属性或者叫做成员变量写成私有的
 * 
 * @author Administrator
 * 
 */
public class Person {
	// 属性定义为私有的
	private String name;
	private int age;

	// 如果我们把属性定义为私有的，在其他类中如果你想访问到怎么办
	// 1.这时我们需要使用方法在设置私有的属性，和取到他
	// 2.一般情况下：设置值setXxx(参数)方法 ，取值getXxx()方法;
	// 定义方法
	// findViewById(R.id.name);
	// 取到的变量名.getText();变量名.setText("1");
	/**
	 * 给属性名字设置值
	 * 
	 * @param name
	 *            名字
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		//创建对象
		Person person = new Person();
		//给对象中的属性赋值
		person.setName("张三");
		//取出对象中的属性
		String str = person.getName();
		System.out.println(str);
	}
}
