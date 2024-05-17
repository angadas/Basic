package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class exmp_Vector {
	public static void main(String[] args) {
		Vector v=new Vector();


		v.add("angad");
		v.add("anil");
		v.add("65.5f");
		v.add('A');
		v.add(101);
		v.add(null);
		v.add(null);
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(3));
		v.set(3, 'B');
		v.set(5, "Ganesh");
		
		System.out.println(v);
		
		v.add(5,200);
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		System.out.println("-------------------print data using Iterator cursor--------------------");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("-------------------print data using ListIterator cursor--------------------");
		ListIterator litr=v.listIterator();
		while(itr.hasNext())
		{
			System.out.println(litr.next());
			
		}
		
		
		
		System.out.println("-------------------print data using Enumaration cursor--------------------");
		Enumeration Enu=v.elements();
		while(Enu.hasMoreElements())
		{
			System.out.println(Enu.nextElement());
			
			
			
			
		}
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
			
		}
		
		
		
		
		
		for(Object s1:v)
		{
			System.err.println(s1);
		}
		
		
	}
}
