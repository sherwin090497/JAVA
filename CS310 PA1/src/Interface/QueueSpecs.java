package Interface;

public interface QueueSpecs<E> {
	
	public boolean isEmpty();
	public void emptyQueue();
	public void enQ(E obj);
	public E deQ();
	public E peek();

}
