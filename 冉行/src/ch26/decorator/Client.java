package ch26.decorator;

public class Client {
	public static void main(String[] args) {
		/*
		//����Ĺ������� �ڵ���
		Componet component=new ConcreteComponent();
		//������
		Componet component2=new ConcreteDecorator1(component);
		//������
		Componet component3=new ConcreteDecorator2(component2);
		component3.doSomething();
		*/
		Componet component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));
		component.doSomething();
	}
}
