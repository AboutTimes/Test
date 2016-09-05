package ch26.decorator;

/**
 * 4.2 具体装饰角色
 * 
 * @author Mountain
 * 
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Componet component) {
		super(component);
	}

	@Override
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}

	private void doAnotherThing() {
		System.out.println("功能C");
	}
}
