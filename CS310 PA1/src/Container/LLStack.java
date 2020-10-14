package Container;

import Interface.StackSpecs;

public class LLStack<E> implements StackSpecs<E>{
	
	private Node<E> top;
	private int stackSize;
	
	public LLStack() {
		top = null;
	}
	
	public int getStackSize(){
		return stackSize;
	}
	public void setStackSize(int data) {
		this.stackSize = data;
		
	}
	
	public Node<E> getTop() {
		return top;
	}
	
	public void setTop(Node<E> top){
		this.top = top;
	}
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public void emptyStack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void push(E obj) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(obj);
		if(top== null) {
			top = newNode;
		}
		else {
			newNode.setNextNode(this.top);
			this.top=newNode;
		}
		stackSize++;
	}
	
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (this.top != null) {
			Node<E> temp = this.top;
			this.top = this.top.getNextNode();
			stackSize--;
			return (E) temp.getData();
		} 
		return null;
	}
	
	@Override
	public E peek() {
		if (top == null) {
			System.out.print("Empty");
		}
		return top.getData();
	}
	
	@Override
	public String toString(){
		Node<E> top = this.top;
		StringBuilder str = new StringBuilder();
		if (top == null) {
			System.out.println("\nQueue is empty");
			return str.toString();
		}
		while (top != null) {
			str.append(top.getData().toString() + "\n");
			top = top.getNextNode();
		}
		return str.toString();
	}
}
