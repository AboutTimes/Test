package ch26;

//4.具体装饰角色（Concrete Decorator）：
//负责给构件对象“贴上”附加的责任。
public class D extends C {
	//添加构造方法
	public D(A a) {
		super(a);
	}
	
	

	public void b(){
		System.out.println("我是功能D");
	}
	@Override
	public void a(){
		super.a();
		//调用我们D中定义的方法：贴上附加的责任
		this.b();
	}
	

}




