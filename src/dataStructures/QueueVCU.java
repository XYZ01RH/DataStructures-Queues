package dataStructures;

public interface QueueVCU<E> {

	public void add( E e );

	public E take();

	public int size();

	public boolean isEmpty();

	public void clear();

}
