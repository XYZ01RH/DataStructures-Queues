package dataStructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class RileyHansonTest<E> {

	@Test
	public void test() {
		
		
		QueueVCU<String> queue = new RileyHansonQueue<String>();
		
		queue.add( String.valueOf("1") );
		queue.add( String.valueOf("2") );
		queue.add( String.valueOf("3") );
		queue.add( String.valueOf("4") );
		
		System.out.println( queue.size() );
		System.out.println( queue.isEmpty() );
		
		queue.toString();
		
		System.out.println( queue.take() );
		System.out.println( queue.take() );
		System.out.println( queue.take() );
		System.out.println( queue.size() );
		
		queue.clear();
		System.out.println( queue.isEmpty() );
	}

}
