package ch21;

/**
 * 内部类，成员内部类:没有使用static就是我们的成员内部类
 * 
 * @author Mountain
 * 
 */
public class MemberInnerClassTest {
	public static void main(String[] args) {
		//创建成员的内部类
		//语法：外部类.内部类 对象名 =new 外部类().new 内部类();
		Outer.OuterInner inner =new Outer().new OuterInner();
		inner.method();
		
	}
}

class Outer {
	//Outer类中定义一个属性和方法
	String name="张三";
	static int i=11;
	public void t(){
		System.out.println("t");
	}
	public static void t1(){
		System.out.println("t1");
	}
		//成员内部类
		public class OuterInner{
			int i=10;
			public void method(){
				System.out.println(name);
				//如果外部的变量与内部的变量名字相同
				//请使用外部类.this.变量名
				System.out.println(Outer.this.i);
				System.out.println(i);
				t();
				t1();
			}
			
		}
}















