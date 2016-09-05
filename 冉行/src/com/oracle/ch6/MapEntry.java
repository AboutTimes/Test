package com.oracle.ch6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapEntry {
		public static void main(String[] args) {
			Map<String,String> map=new HashMap<String , String>();
			map.put("sb1", "dsb1");
			map.put("sb2", "dsb2");
			map.put("sb3", "dsb3");
			
			Set set=map.entrySet();
			Iterator it=set.iterator();
			
			while(it.hasNext()){
				Map.Entry entry=(Entry) it.next();
				String key=(String) entry.getKey();
				String value=(String) entry.getValue();
				System.out.println(key);
				System.out.println(value);
				
			}
		}
}
