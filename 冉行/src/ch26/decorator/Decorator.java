package ch26.decorator;

/**
 * 3.װ�ν�ɫ
 * 
 * @author Mountain
 * 
 */
public class Decorator implements Componet {
	// ����һ��������Component�����������
	private Componet componet;

	public Decorator(Componet component) {
		this.componet = component;
	}

	public void doSomething() {
		componet.doSomething();
	}

}
