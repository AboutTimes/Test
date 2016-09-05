package com.oracle.ch6;

/**
 * 该类重写equals，只是名字相同他们就是对一个对象
 * 
 * @author Mountian 我们创建二个对象，只要名字相同他们就是一个对象
 * 
 */
public class People {
	public static void main(String[] args) {
		// 创建二个对象
		People people = new People();
		people.name = "张三";
		People people1 = new People();
		people1.name = "张三";
		// 调用对象的equals方法
		System.out.println(people.equals(people1));
		String s=people.name;
		String s1=people1.name;
		System.out.println(s.equals(s1));
		
	
		
		System.out.println(people.equals("张三"));
		//重写equels方法后，执行结果为true
		System.out.println(people.equals(people));
		
	}

	String name;
	//这里我们需要重写equals方法
	@Override
	public boolean equals(Object obj) {
		//判断当前对象与传入的对象是不是同一个对象
		if(this==obj){
			return true;
		}
		//判断传入的对象是不是People的实例化
		if(obj instanceof People){
			//接下来判断
			//1.把传入进来的obj强制转换为People
			People p=(People) obj;
			//判断当前对象中的名字是否与传入进来的名字相同
			if(this.name.equals(p.name)){
				return true;
			}
			//return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}
