package RanjithKumar;
import java.util.*;

public class Collection_Set
{

	public static void main(String[] args) 
	{
		HashSet<Integer>hs = new HashSet();
		HashSet<Integer>hs1 = new HashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(40);
		System.out.println(hs1);
		hs1.addAll(hs);
		System.out.println(hs1);
		System.out.println(hs.getClass());
		System.out.println(hs.isEmpty());
	
		System.out.println(hs1);
		System.out.println(hs);
		System.out.println(hs.size());
		
		

		
   LinkedHashSet<Integer> lhs = new LinkedHashSet();
		
		lhs.add(10);
		lhs.add(30);
		lhs.add(30);
		lhs.add(20);
		lhs.add(50);
		lhs.add(70);
		
		System.out.println(lhs);
		
		System.out.println(lhs.equals(hs));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		System.out.println(lhs.containsAll(hs));
		
		
		TreeSet<Integer> ts = new TreeSet();
		
		ts.add(50);
		ts.add(40);
		ts.add(60);
		ts.add(20);
	    ts.add(10);
	    ts.add(40);
		System.out.println(ts.size());
	    System.out.println(ts);
	    System.out.println(ts.hashCode());
	    System.out.println(ts.first());
	    System.out.println(ts.pollFirst());
	    System.out.println(ts.pollLast());
	    System.out.println(ts);
	    System.out.println(ts.last());
	  
	}
}
