package ch18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {
	// 把猫放到我们的Map集合中去
	public static void main(String[] args) {
		// 1.创建Map集合,限制传入的类型
		Map<String, Cat> map = new HashMap<String, Cat>();
		// 2.通过for添加Map中的键与值添加进去
		String str[] = { "小花", "小张", "小花花", "小黑", "小红" };
		for (int i = 0; i < 5; i++) {
			// 2.1创建Cat的对象
			Cat cat = new Cat(str[i], 10 + i);
			// 2.2添加到map中
			map.put(str[i], cat);
		}
		// 3.输出
		// 4.需要得到Set集合
		Set<String> set = map.keySet();
		// 5.得到迭代器
		Iterator it = set.iterator();
		// 6.通过While输出，
		while (it.hasNext()) {
			// 6.1得到key:这里it.next()得到是一个Object，需要强制转
			String key = (String) it.next();
			// 6.2通过map的key得到对应的值
			//之前我们的Value是不是Object而在呢是Cat
			Cat cat=map.get(key);
			//6.3输出键：输出值
			System.out.print("键:"+key);

			System.out.print("\t名字:"+cat.getName());
			System.out.print("\t年龄:"+cat.getAge());
			System.out.println();
		}
		

	}
}
