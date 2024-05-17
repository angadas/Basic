package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingDeque;

public class exmpl_linkedList {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("angad");
		ll.add("101");
		ll.add("65.65f");
		ll.add("101");
		ll.add("null");
		ll.add("null");
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(2));
	
	ll.set(2, 'B');
	System.out.println(ll);
	ll.add(2,500);
	System.out.println(ll);
	
	
	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	ListIterator litr=ll.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	 
	
	
	for(int i=0;i<=ll.size()-1;i++)
	{

		System.out.println(ll.get(i));
	
	}
	
	
	for(Object s2:ll)
	{
		System.out.println(s2);
	}
	
	
	}
}
