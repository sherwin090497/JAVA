package Interface;

public interface QueueSpecs<E> {
	
	public boolean isEmpty();
	public boolean isFull();
	public void emptyQueue();
	public void enQ(E obj);
	public E deQ();
	public E peek();

}
