package Perctise.method;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hashmapmethod {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		
		map.put(1, "shailendra");
		map.put(2, "rai");
		map.put(3, "radha");
		
		Queue q=new PriorityQueue();
		System.out.println(map.get(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		for(Map.Entry me:map.entrySet()) {
			
			System.out.println(me.getKey()+":"+me.getValue());
			
		}
		
				}

}
