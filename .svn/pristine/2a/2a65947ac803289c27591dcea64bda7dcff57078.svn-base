package com.oracle.ch20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * MapEntry的使用:输出Map集合的第二种方式
 * 
 * @author Administrator
 * 
 */
public class MapEntryTest {
	public static void main(String[] args) {
		// 向Map中添加值和之前没有区别
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "星期一");
		map.put("2", "星期二");
		map.put("3", "星期三");

		// 任务：统计单词出现的次数
		// 输出
		Set set = map.entrySet();
		// 得到迭代器
		Iterator it = set.iterator();

		// while操作：如何判断
		while (it.hasNext()) {
			// 得到下一次 it.next();
			// 这里是通过Entry来操作
			Map.Entry entry = (Entry) it.next();
			
			//是不是通过Key来得到value
			String key = (String) entry.getKey();
			//如果存放的是其他对象：
			/**
			 * 比如：我存放的是一个人类对象
			 * Person person =(Person)entry.getValue();
			 * System.out.println(person.getName);
			 */
			String value = (String) entry.getValue();
			System.out.println(key);
			System.out.println(value);

		}

	}
}
