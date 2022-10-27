package RanjithKumar;
import java.util.*;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("Ranjith");
		al.add("Kumar");
		al.add(10);
		al.add(20);
		al.add('R');
		al.add('M');
		al.add(0.02);
		al.add(1.5);
		
		ArrayList<Object> ab = new ArrayList<>();
		al.add("Kumar");
		al.add('a');
		al.add("Ranjith");
		
		ab = (ArrayList<Object>) al.clone();
	
		
		System.out.println(ab.remove(2));
		System.out.println(al);
		System.out.println(ab);	
		System.out.println(al.addAll(ab));
		System.out.println(al);
		System.out.println(al.contains("Kumar"));
		System.out.println(al.containsAll(ab));
		System.out.println(al.equals(ab));
		System.out.println(al.get(0));
		System.out.println(al.hashCode());
		System.out.println(al.indexOf('M'));
		System.out.println(al.isEmpty());
		ab.removeAll(ab);
		System.out.println(ab.isEmpty());
	   
		System.out.println(al);
		System.out.println(ab);
      System.out.println(al.getClass());
      System.out.println(al.lastIndexOf("Arun"));
        al.set(2,"MySql");
        System.out.println(al);	
      	System.out.println(al.size());
		

	}

}
