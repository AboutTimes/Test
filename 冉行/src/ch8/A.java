 package ch8;

public class A {
	static B b = new B();
	static {
		C c = new C();
	}
	{
		System.out.println("A");
	}
}
