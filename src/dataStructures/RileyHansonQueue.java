package dataStructures;

import java.util.LinkedList;

public class RileyHansonQueue<E> implements QueueVCU<E> {

	private LinkedList<E> linkList;

	public RileyHansonQueue() {
		linkList = new LinkedList<E>();
	}

	@Override
	public void add(E data) {
		linkList.add(data);

	}

	@Override
	public E take() {
		return linkList.remove(0);
	}

	@Override
	public int size() {
		return linkList.size();
	}

	@Override
	public boolean isEmpty() {
		return linkList.isEmpty();
	}

	@Override
	public void clear() {
		linkList.clear();
	}
	
	public String toString() {
		return linkList.toString();
	}

}
