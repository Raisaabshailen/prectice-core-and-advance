package First.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap();
		
		map.put(101, "shailendra");
		map.put(102, "radhe");
		map.put(103, "shivaa");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("radhe"));
		System.out.println(map.get(102));
		map.replace(102, "krishna");
		System.out.println(map.get(102));
		System.out.println(map);
		
		
		for(Map.Entry me:map.entrySet()) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		System.out.println(map.size());
		/*
		 * Set set=map.entrySet(); System.out.println(set);
		 * 
		 * 
		 * Iterator itr =set.iterator();
		 * 
		 * while(itr.hasNext()) { //System.out.println(itr.next());
		 * 
		 * Entry entry=(Map.Entry)itr.next();
		 * 
		 * System.out.println(entry.getKey()+"::"+entry.getValue()); }
		 */
		
	}

}
