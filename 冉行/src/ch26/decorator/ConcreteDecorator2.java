package ch26.decorator;

/**
 * 4.2 ����װ�ν�ɫ
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
		System.out.println("����C");
	}
}
