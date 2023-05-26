package Daily_mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Sample2_collection 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(101);
		al.add(75.5f);
		al.add('A');
		al.add(null);
		al.add(null);
		
		System.out.println(al.size());  //6
		System.out.println(al.get(1));   //101
		System.out.println(al.isEmpty());  //false
		
	    //add info in between arraylist
		al.add(2, 300);
		System.out.println(al);
		
		//remove info in between arraylist
		al.remove(4);
		System.out.println(al.size());
		
		System.out.println("---Print all data from arraylist using iterator---");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data from arraylist using List_iterator---");
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.hasNext());
		}
		
		System.out.println("---Print all data from arraylist using for loop---");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---Print all data from arraylist using forEach loop---");
		
		for(Object s1 : al)
		{
			System.out.println(s1);
		}
		
		al.clear();
		System.out.println(al.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
