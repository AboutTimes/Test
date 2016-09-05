package com.oracle.ch26.decorator;

/**
 * 2.具体构件角色
 * 
 * @author Mountain
 * 
 */
public class ConcreteComponent implements Componet {

	@Override
	public void doSomething() {
		System.out.println("功能A");
	}

}
