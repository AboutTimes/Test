package com.oracle.ch18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		// Map集合
		Map<String, Object> map = new HashMap<String, Object>();
		// 向集合中添加内容
		map.put("1", "星期一");
		map.put("1", "星期一");
		// 输出map集合的大小
		//System.out.println(map.size());
		map.put("2", "星期二");

		// 输出内容，根据key键，输出值
		// 需要强制类型转换
		String str = (String) map.get("1");
		//System.out.println(str);
		str = (String) map.get("2");
		//System.out.println(str);

		// 以上不是我们想要的结果，我得输出所有的信息
		// 1.得到Set集合
		// 以下的方法是得到所有的键
		Set set = map.keySet();
		// 2.迭代器进行输出
		Iterator it = set.iterator();
		// 通过While操作
		while (it.hasNext()) {
			//在这里我们可以得到所有的Key
			//如果想通过Key得到Value是如何得到的
			//Map.get(Key);
			//it.next()每调用一次，就要重新循环一次
			/*这里的代码需要修改System.out.print("键"+it.next());
			System.out.print("值"+map.get(it.next()));
			System.out.println();
			*/
			String key=(String) it.next();
			System.out.print("键"+key+"=");
			System.out.print("值"+map.get(key));
			System.out.println();
		}
		// HashSet的底层是HashMap实现的，
		//而HashMap底层使用是的Entry数据，
		//Entry又是一个链表;
	}
}
