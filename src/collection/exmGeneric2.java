package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class exmGeneric2 {
	public static void main(String[] args) {

		TreeSet<Integer> tr=new TreeSet<Integer>(); 
		tr.add(500);
		tr.add(100);
		tr.add(200);
		tr.add(400);
		tr.add(300);
		tr.add(700);
		tr.add(600);
		tr.add(500);

		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("rahul");
		al.add("ganesh");
		al.add("mahesh");
		//al.add(100);
		for(String s1:al)
		{
		System.out.println(s1);
		}
	}
}
