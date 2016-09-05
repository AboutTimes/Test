package ch16;

import java.util.List;

/**
 * 动物类： 猫类： 动物类中包含很多该类
 * 
 * @author Adminis1trator
 * 
 */
public class Animal {
	// 分类
	private String classify;
	// 把一系列的猫放进去
	// 1.可以使用ArrayList
	// 2.使用LindkedList
	private List<Cat> list;

	/**
	 * 通过构造方法把动物分类，以及一系列的猫传入
	 * 
	 * @param classify
	 * @param list
	 */
	public Animal(String classify, List<Cat> list) {
		this.classify = classify;
		this.list = list;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public String getClassify() {
		return classify;
	}

	public void setList(List<Cat> list) {
		this.list = list;
	}

	public List<Cat> getList() {
		return list;
	}

}
