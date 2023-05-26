package Daily_mock;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 
{
	public static void main(String[] args)
	{
		Vector V = new Vector();
		V.add("Neel");
		V.add(110);
		V.add(65.8f);
		V.add('A');
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		System.out.println(V.size());
		System.out.println(V.isEmpty());
		System.out.println(V.get(3));
		
		//to add info in between vector
		V.add(1, "java");
		System.out.println(V);
		
		//to remove info in between vector
		V.remove(2);
		System.out.println(V);
		
		System.out.println("---Print all data from vector using iterator cursor---");
		Iterator itr = V.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data from vector using List_iterator cursor---");
		ListIterator litr = V.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print all data from vector using for loop---");
		
		for(int i=0; i<=V.size()-1; i++)
		{
			System.out.println(V.get(i));
		}
		
		System.out.println("---Print all data from vector using forEach loop---");
		for(Object s1 : V)
		{
			System.out.println(s1);
		}
		
		System.out.println("---Print all data from vector using Enumerator cursor---");
		Enumeration enu = V.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		V.clear();
		System.out.println(V.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
