package com.oracle.ch6;

/**
 * ������дequals��ֻ��������ͬ���Ǿ��Ƕ�һ������
 * 
 * @author Mountian ���Ǵ�����������ֻҪ������ͬ���Ǿ���һ������
 * 
 */
public class People {
	public static void main(String[] args) {
		// ������������
		People people = new People();
		people.name = "����";
		People people1 = new People();
		people1.name = "����";
		// ���ö����equals����
		System.out.println(people.equals(people1));
		String s=people.name;
		String s1=people1.name;
		System.out.println(s.equals(s1));
		
	
		
		System.out.println(people.equals("����"));
		//��дequels������ִ�н��Ϊtrue
		System.out.println(people.equals(people));
		
	}

	String name;
	//����������Ҫ��дequals����
	@Override
	public boolean equals(Object obj) {
		//�жϵ�ǰ�����봫��Ķ����ǲ���ͬһ������
		if(this==obj){
			return true;
		}
		//�жϴ���Ķ����ǲ���People��ʵ����
		if(obj instanceof People){
			//�������ж�
			//1.�Ѵ��������objǿ��ת��ΪPeople
			People p=(People) obj;
			//�жϵ�ǰ�����е������Ƿ��봫�������������ͬ
			if(this.name.equals(p.name)){
				return true;
			}
			//return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}
