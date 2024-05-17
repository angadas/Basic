package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class exm_TreeSet {
	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		
		tr.add(100);
		tr.add(200);
		tr.add(300);
		tr.add(400);
		tr.add(500);
		tr.add(600);
		tr.add(700);
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty()); 
		System.out.println(400);
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		tr.pollFirst();
		System.out.println(tr);
		tr.pollLast();
		System.out.println(tr);
		
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
		
	}
}
