package ch19;

import java.util.HashSet;
import java.util.Set;

/**
 * 只要对象中的名字相同就不添加该对象到Set集合中去
 * 
 * @author Administrator
 * 
 */
public class SetTest1 {
	public static void main(String[] args) {
		Set set = new HashSet<Object>();
		//如果名字相同：我就不把对象添加到集合中
		//这时我们需要重写hashCode和equals方法
		set.add(new Person("张三"));
		set.add(new Person("张三"));
		System.out.println(set);
	}
}

class Person {
	String name;

	@Override
	public int hashCode() {
		// 经验值：我们无需要修改
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// 如果他们在运行时不是同一个类就返回false
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
			//如果你想把二个对象中名字相同的信息添加到集合中时
			//(name.equals(other.name)或者不重写hashCode和equals
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(String name) {
		this.name = name;
	}
	// 重写hashCode和equals方法

}
