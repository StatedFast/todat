package com.woniuxy;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapPrint {
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("2", "d");
//		System.out.println(map);
//		System.out.println("===========");
//		Set keys = map.keySet();
//		for (Object key : keys) {
//			System.out.println(key+"="+map.get(key));
//		}
		System.out.println("===========");
//		Iterator iter = map.entrySet().iterator();
//		while(iter.hasNext()) {
//			Map.Entry entry = (Map.Entry)iter.next();
//			Object key = entry.getKey();
//			Object value = entry.getValue();
//			System.out.println(key+":"+value);
//		}
		Set<Map.Entry> ms = map.entrySet();
		for (Map.Entry entry : ms) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}

}
