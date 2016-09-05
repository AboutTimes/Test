package ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	// ÿֻè��Ӧ�кܶ�Сè
	public static void main(String[] args) {
		// map��list���ʹ��
		// 1.����һ��map����
		//Key��Ӧһ��List����
		Map<String, List<Cat>> map = 
				new HashMap<String, List<Cat>>();
		//2.��ֵ
		//�Ǹ����ǵ�Key��ֵ�õ�
		String str[]={"Сǿ","С����","������"};
		//�����Ǹ����ǵ�Cat��ֵ�õ�
		String cat[]={"С��", "С��", "С����", "С��", "С��"};
		//��������key��
		for (int i = 0; i < str.length; i++) {
			List<Cat> list=new ArrayList<Cat>();
			//����ڲ�Value
			for (int j = 0; j < cat.length; j++) {
				//ע�⣺��������Ӽ���List
				//���è
				Cat cats=new Cat(cat[j], 10+j);
				//��ӵ�������ȥ
				list.add(cats);
			}
			//ע�⣺���������Map����
			map.put(str[i], list);
		}
		//�������
		
		//1.�õ�KeyҲ�������ǵ�Set����
		Set set =map.keySet();
		//2.�õ�������
		Iterator it=set.iterator();
		//3.ͨ��while�������Ϣ
		
		while(it.hasNext()){
			//�õ�Key
			String key=(String) it.next();
			//�õ�List����
			List<Cat> list=map.get(key);
			System.out.println("��è:"+key+"��Ӧ��Сè:");
			//���List�����е�è
			for(Cat cats:list){
				System.out.print("\t\t����:"+cats.getName());
				System.out.print("\t\t����:"+cats.getAge());
			}
			System.out.println("\t\t\t\t");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
