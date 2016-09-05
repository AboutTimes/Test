package com.oracle.ch26;

//3.装饰角色（Decorator）：
//持有一个构件（Component）对象的引用，
//并定义一个与抽象构件接口一致的接口
public class C implements A {
	A a;

	public C(A a) {
		this.a = a;
	}

	// 重写接口中的方法，并且调用接口中的方法
	@Override
	public void a() {
		
		a.a();
	}

}
