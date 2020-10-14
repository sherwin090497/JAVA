package linkedlists;

public class Node<E> {

	public E data;
	public Node<E> nextNode;
	
	public Node(E data)
	{
		this(data,null);
	}
	

	public Node(E data, Node<E> next)
	{
		this.data=data;
		this.nextNode= next;
	}
	
}
