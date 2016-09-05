package ch26.decorator;

public class Client {
	public static void main(String[] args) {
		/*
		//具体的构建对象 节点流
		Componet component=new ConcreteComponent();
		//过滤流
		Componet component2=new ConcreteDecorator1(component);
		//过滤流
		Componet component3=new ConcreteDecorator2(component2);
		component3.doSomething();
		*/
		Componet component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));
		component.doSomething();
	}
}
