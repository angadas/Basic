package testNG;

import java.util.HashMap;
import java.util.Set;

public class hasmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "keshav");
		hm.put(2, "angad");
		hm.put(3, "ramesh");
		hm.put(4, "rohan");
		System.out.println(hm.containsKey(3));
		System.out.println(hm);
		System.out.println(hm.get(1));
		Set<Integer>allkeys=hm.keySet();
		for(Integer key:allkeys) {
			System.out.println(key+"-"+hm.get(key));
			System.out.println("..........................");
		Set<Integer>keys=hm.keySet();
		
		for(Integer abc:keys)
		{
			System.out.println(abc+"-"+hm.get(abc));
		}
		}

	}
}
