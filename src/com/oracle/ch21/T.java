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
		//�����ڲ���ķ�ʽʵ�ֽӿ�
		T t=new T(new T1() {
			@Override
			public void show() {
				System.out.println("ABC");
			}
		});
		t.t();
		
	}
	

}

// ����һ���ӿ�
interface T1 {
	public void show();
}
