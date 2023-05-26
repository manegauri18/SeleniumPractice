package Daily_mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list1 
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Neel");
		al.add(110);
		al.add(65.8f);
		al.add('A');
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());  //6
		System.out.println(al.isEmpty());  //false
		System.out.println(al.get(1)); //110
		
		//to add info in between array_list
		al.add(2, 330);
		System.out.println(al);
		
		//to remove info in between array_list
		al.remove(3);
		System.out.println(al);
		
		System.out.println("---Print all info from array_list using iterator cursor---");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all info from array_list using List_iterator cursor---");
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print all info from array_list using for loop---");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---Print all info from array_list using forEach loop---");
		for(Object s1 : al)
		{
			System.out.println(s1);
		}
		
		al.clear();
		System.out.println(al.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
