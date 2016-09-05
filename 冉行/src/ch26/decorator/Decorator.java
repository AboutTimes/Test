package ch26.decorator;

/**
 * 3.装饰角色
 * 
 * @author Mountain
 * 
 */
public class Decorator implements Componet {
	// 持有一个构件（Component）对象的引用
	private Componet componet;

	public Decorator(Componet component) {
		this.componet = component;
	}

	public void doSomething() {
		componet.doSomething();
	}

}
