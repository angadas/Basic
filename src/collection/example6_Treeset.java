package collection;

	 import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
	 public class example6_Treeset 
	 {
	 public static void main(String[] args) 
	 {
	 TreeSet tr=new TreeSet();
	 tr.add(500);
	 tr.add(100);
	 tr.add(200);
	 tr.add(400);
	 tr.add(300);
	 tr.add(700);
	 tr.add(600);
	 tr.add(500);
	 System.out.println(tr);
	 System.out.println(tr.size());
	 System.out.println(tr.isEmpty());
	 tr.remove(400);
	 System.out.println(tr);
	 System.out.println(tr.first());
	 System.out.println(tr.last());
	 tr.pollFirst();
	 System.out.println(tr);
	 tr.pollLast();
	 System.out.println(tr);
	 System.out.println("---print all data using Iterator cursor----");
	 Iterator itr = tr.iterator();
	 while(itr.hasNext())
	 {
	 System.out.println(itr.next());
	 }
	 System.out.println("----print all data using for each loop-----");
	 for(Object s1:tr)
	 {
	 System.out.println(s1);
	 }
	 TreeSet<Integer> tr1=new TreeSet<Integer>(); 
	 tr1.add(500);
	 tr1.add(100);
	 tr1.add(200);
	 tr1.add(400);
	 tr1.add(300);
	 tr1.add(700);
	 tr1.add(600);
	 tr1.add(500);
	 for(Integer s1:tr1)
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
	 
	

