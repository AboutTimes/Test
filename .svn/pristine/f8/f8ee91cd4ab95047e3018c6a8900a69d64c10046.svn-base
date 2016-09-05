package com.oracle.ch21;

public class T {
	T1 t;

	public T(T1 t) {
		this.t = t;
	}
	public void t(){
		t.show();
	}
	public static void main(String[] args) {
		//匿名内部类的方式实现接口
		T t=new T(new T1() {
			@Override
			public void show() {
				System.out.println("ABC");
			}
		});
		t.t();
		
	}
	

}

// 定义一个接口
interface T1 {
	public void show();
}
