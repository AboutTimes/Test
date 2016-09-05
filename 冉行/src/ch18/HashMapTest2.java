package ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	// 每只猫对应有很多小猫
	public static void main(String[] args) {
		// map与list结合使用
		// 1.创建一个map集合
		//Key对应一组List集合
		Map<String, List<Cat>> map = 
				new HashMap<String, List<Cat>>();
		//2.赋值
		//是给我们的Key赋值用的
		String str[]={"小强","小李子","车李子"};
		//这里是给我们的Cat赋值用的
		String cat[]={"小花", "小张", "小花花", "小黑", "小红"};
		//外层是添加key的
		for (int i = 0; i < str.length; i++) {
			List<Cat> list=new ArrayList<Cat>();
			//添加内层Value
			for (int j = 0; j < cat.length; j++) {
				//注意：这里是添加集合List
				//添加猫
				Cat cats=new Cat(cat[j], 10+j);
				//添加到集合中去
				list.add(cats);
			}
			//注意：这里是添加Map集合
			map.put(str[i], list);
		}
		//输出内容
		
		//1.得到Key也就是我们的Set集合
		Set set =map.keySet();
		//2.得到迭代器
		Iterator it=set.iterator();
		//3.通过while来输出信息
		
		while(it.hasNext()){
			//得到Key
			String key=(String) it.next();
			//得到List集合
			List<Cat> list=map.get(key);
			System.out.println("大猫:"+key+"对应的小猫:");
			//输出List中所有的猫
			for(Cat cats:list){
				System.out.print("\t\t名字:"+cats.getName());
				System.out.print("\t\t年龄:"+cats.getAge());
			}
			System.out.println("\t\t\t\t");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
