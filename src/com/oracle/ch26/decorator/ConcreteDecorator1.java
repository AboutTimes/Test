package com.oracle.ch26.decorator;

/**
 * 4.1 具体装饰角色
 * 
 * @author Mountain
 * 
 */
public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Componet component) {
		super(component);
	}

	@Override
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}
	private void doAnotherThing(){
		System.out.println("功能B");
	}
}
