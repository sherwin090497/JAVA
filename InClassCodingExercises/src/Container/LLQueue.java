package Container;

import Interface.QueueSpecs;

public class LLQueue<E>{
	
	private class Node<E>{
		private E data;
		private Node<E> nextNode;
		
		public Node(E data){
			this(data,null);
		}
	
		public Node(E Data, Node<E> nextNode)
		{
			this.data = Data;
			this.nextNode=nextNode;
		}
	}

	private Node<E> front;
	private Node<E> rear;
	private int lengthOfQ;
	
	public LLQueue()
	{
		this.lengthOfQ = 0;
		this.front=null;
		this.rear=null;
	}
	

	public int size()
	{
		return lengthOfQ;
	}

	
	@Override
	public String toString(){
		
		Node<E> curr = this.front;
		StringBuilder str = new StringBuilder(); 
		str.append("\n{"); 
		
		while(curr!=null)
		{
			str.append("Data:"+curr.data+" ");
			curr=curr.nextNode;
		}
		str.append("}");
		
		return str.toString();

	}

}
