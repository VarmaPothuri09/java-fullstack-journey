package com.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Maps {
   
	public static void main(String[] args) {
		Pojo pojo1 =new Pojo(1,"Varma",1234,"UBIN");
		Pojo pojo2 =new Pojo(1,"Varma",1234,"UBIN");
		Pojo pojo3 =new Pojo(1,"Varma",1234,"UBIN");
		Pojo pojo4 =new Pojo(1,"Varma",1234,"UBIN");
		
		
		Map<Integer, Pojo> map1=new LinkedHashMap<Integer, Pojo>();
		map1.put(1, pojo1);
		map1.put(2, pojo2);
		map1.put(3, pojo3);
		map1.put(4, pojo4);
		
		for(Integer key:map1.keySet()) {
			System.out.println(key+ "="+map1.get(key));
		}
		for(Entry<Integer, Pojo> entry:map1.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.keySet());
		System.out.println(map1.values());
	}	
		public void mapClass() {
			Map map =new HashMap();
			map.put(1, "virat");
			map.put(2,"varma");
			map.put(3, null);
			map.put(null, null);
			map.put("varma", 1);
			
			System.out.println(map);
		
	
	}
		public void rawMap() {
		Map<String, Integer> map2=new TreeMap<String, Integer>();
		map2.put("varma", 1);
		map2.put("virat", 2);
		map2.put("rohit", 3);
		map2.put("gill", 4);
		map2.put("mahi", 5);
		System.out.println(map2);
		}
		
	}

