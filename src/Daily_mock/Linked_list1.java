package Daily_mock;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list1 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add("Java");
		ll.add(201);
		ll.add('B');
		ll.add(75.6f);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(0));
		
		ll.add(0, "python");
		System.out.println(ll);
		
        ll.remove(3);
        System.out.println(ll);
        
        System.out.println("---Print all info from linkedlist using iterator cursor---");
        Iterator itr = ll.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        System.out.println("---Print all info from linkedlist using List_iterator cursor---");
        ListIterator litr = ll.listIterator();
        
        while(litr.hasNext())
        {
        	System.out.println(litr.next());
        }
        
        System.out.println("---Print all info from linkedlist using for loop---");
        for(int i=0; i<=ll.size()-1; i++)
        {
        	System.out.println(ll.get(i));
        }
        
        System.out.println("---Print all info from linkedlist using forEach loop---");
        for(Object s1 : ll)
        {
        	System.out.println(s1);
        }
        
        ll.clear();
        System.out.println(ll.size());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
	}

}
