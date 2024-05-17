package basic;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		//LinkedHashSet lHs = new LinkedHashSet();
		hs.add("Rahul");
		hs.add(65.5f);
		hs.add('A');
		hs.add("Rahul");
		hs.add(null);
		hs.add(101);
		hs.add(null);
		hs.add("bold");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("Rahul"));
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		HashSet hs1=new HashSet();
		System.out.println(hs1);
		
//		Iterator itr1 = hs.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//			
//		}
		
		Iterator itr1=hs1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		
		
	}

}
		