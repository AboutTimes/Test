package ch18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {
	// ��è�ŵ����ǵ�Map������ȥ
	public static void main(String[] args) {
		// 1.����Map����,���ƴ��������
		Map<String, Cat> map = new HashMap<String, Cat>();
		// 2.ͨ��for���Map�еļ���ֵ��ӽ�ȥ
		String str[] = { "С��", "С��", "С����", "С��", "С��" };
		for (int i = 0; i < 5; i++) {
			// 2.1����Cat�Ķ���
			Cat cat = new Cat(str[i], 10 + i);
			// 2.2��ӵ�map��
			map.put(str[i], cat);
		}
		// 3.���
		// 4.��Ҫ�õ�Set����
		Set<String> set = map.keySet();
		// 5.�õ�������
		Iterator it = set.iterator();
		// 6.ͨ��While�����
		while (it.hasNext()) {
			// 6.1�õ�key:����it.next()�õ���һ��Object����Ҫǿ��ת
			String key = (String) it.next();
			// 6.2ͨ��map��key�õ���Ӧ��ֵ
			//֮ǰ���ǵ�Value�ǲ���Object��������Cat
			Cat cat=map.get(key);
			//6.3����������ֵ
			System.out.print("��:"+key);

			System.out.print("\t����:"+cat.getName());
			System.out.print("\t����:"+cat.getAge());
			System.out.println();
		}
		

	}
}
