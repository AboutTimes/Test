package ch16;

import java.util.List;

/**
 * �����ࣺ è�ࣺ �������а����ܶ����
 * 
 * @author Adminis1trator
 * 
 */
public class Animal {
	// ����
	private String classify;
	// ��һϵ�е�è�Ž�ȥ
	// 1.����ʹ��ArrayList
	// 2.ʹ��LindkedList
	private List<Cat> list;

	/**
	 * ͨ�����췽���Ѷ�����࣬�Լ�һϵ�е�è����
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
