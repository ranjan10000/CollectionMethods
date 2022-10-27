package RanjithKumar;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_Queue {

	public static void main(String[] args)
	{
		 PriorityQueue<Integer> pq = new PriorityQueue<>();
	
  	    pq.add(30);
	    pq.add(5);
	    pq.add(10);
	    pq.add(15);
		pq.add(20);
		pq.add(25);
		
	
		System.out.println(pq);
		
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.getClass());
		System.out.println(pq.hashCode());
		pq.remove();
		System.out.println(pq);
		pq.remove(20);
		System.out.println(pq);
	
		 Deque<Integer> ad = new ArrayDeque<>();
		
		ad.add(15);
		ad.add(3);
		ad.add(6);
		ad.add(9);
		ad.add(12);
		
		System.out.println(ad);
		ad.remove(9);
		ad.addFirst(10);
		ad.addLast(50);
		System.out.println(ad);
		System.out.println(ad.offer(80));
		System.out.println(ad.element());
		System.out.println(ad);
		ad.pollFirst();
		ad.pollLast();
		System.out.println(ad.peek());
		ad.removeFirst();
		ad.removeLast();
		System.out.println(ad);

		
	}

}
