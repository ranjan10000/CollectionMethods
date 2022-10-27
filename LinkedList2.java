package RanjithKumar;

import java.util.LinkedList;

public class LinkedList2 
{

	public static void main(String[] args) 
	{
	
		LinkedList<String> Students = new LinkedList<>();
		
		Students.add("Std1");
		Students.add("std3");
		Students.add("std5");
		Students.addFirst("Std0");
		Students.addLast("Std2");
		System.out.println(Students);
		System.out.println(Students.element());
		System.out.println(Students.getFirst());
		System.out.println(Students.getLast());
		Students.removeFirst();
		Students.removeLast();
		System.out.println(Students);
		System.out.println(Students.peekFirst());;
		System.out.println(Students.peekLast());
		
		System.out.println(Students.poll());
		System.out.println(Students);
		Students.push("std6");
		System.out.println(Students);
		
		Students.offer("Std7");
		
		System.out.println(Students);
		
		System.out.println(Students.subList(0, 2));
		
	
		System.out.println(Students);

	}

}
