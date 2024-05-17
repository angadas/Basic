package collection;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistExam2 {
	private static Object Ganesh;

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Angad");
		al.add(101);
		al.add(65.5f);
		al.add('A'); //B
		al.add(101);
		al.add(null); //Ganesh
		al.add(null);
		System.out.println(al);
		System.out.println(al.size()); 
		System.out.println(al.isEmpty()); 
		
		System.out.println(al.get(3)); 
		
		al.set(3,'B');
		al.set(5, Ganesh);
		System.out.println(al);
		al.add(5,200);
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		
		System.out.println("--------ArrayList data using Itarair");
		Iterator itr=al.iterator();
		
		
		while(itr.hasNext())
		{
			System.err.println(itr.next());
			
		}
		

		System.out.println("--------ArrayList data using ListItarair");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
			for(int i=0;i<=al.size()-1;i++)
			{
				System.out.println(al.get(i));
			}
			
			for(Object s1:al)
			{
				System.out.println(s1);
			}
	
		
	
	}
}
