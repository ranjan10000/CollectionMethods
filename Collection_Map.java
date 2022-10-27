package RanjithKumar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Collection_Map {

	public static void main(String[] args)
	{
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "aaa");
		hm.put(2, "bbb");
		hm.put(3, null);
		hm.put(4, null);
		hm.put(null, "ddd");
		hm.put(null, "eee");
		hm.put(null, null);
		hm.put(5, "fff");
		
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.hashCode());
		hm.remove(5, "fff");
		hm.replace(2, "uuu");
		System.out.println(hm.size());
		System.out.println(hm);
		hm.remove(3);
		hm.replace(1, "teleapps");
        System.out.println(hm);
		
		
		LinkedHashMap<Integer,String> lm = new LinkedHashMap<Integer,String>();
		
		lm.put(12, null);
		lm.put(10, null);
		lm.put(11, "hello");
		lm.put(15, "tele");
		lm.put(15, "apps");
		lm.put(null, null);
		
		System.out.println(lm);
		System.out.println(lm.get(11));
		System.out.println(lm.isEmpty());
		lm.replace(11, "hello");
		System.out.println(lm);
		System.out.println(lm.containsKey(15));
        System.out.println(lm.keySet());
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(104, "nop");
		tm.put(102, "ghi");
		tm.put(100, "abc");
		tm.put(101, "def");
		tm.put(103, "klm");
		tm.put(108, "klm");
		
		System.out.println(tm);
		System.out.println(tm.get(102));
		System.out.println(tm.remove(104));
		System.out.println(tm.keySet());
		System.out.println(tm.size());
		tm.replace(100, "teleapps");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.higherKey(101));
		System.out.println(tm.headMap(101));
		System.out.println(tm.lastEntry());
     	System.out.println(tm.getClass());

	}

}
