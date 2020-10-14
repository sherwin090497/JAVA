package Container;

import Interface.QueueSpecs;

public class StackQ<E> implements QueueSpecs<E>{
	
	private LLStack<E> enQStack;
	private LLStack<E> deQStack;
	
	public StackQ() {
		enQStack = new LLStack<E>();
		deQStack = new LLStack<E>();
	}
	
	public int length() {
		enQStack.getStackSize();
		return enQStack.getStackSize();
	}
	
	
	@Override
	public boolean isEmpty() {
		 if (enQStack.isEmpty() && deQStack.isEmpty()) {
	            return true;
	        }
	       return false;
	}

	@Override
	public void emptyQueue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enQ(E obj) {
		// TODO Auto-generated method stub
		enQStack.push(obj);
		System.out.print("\nData Inserted!");
	}

	@Override
	public E deQ() {
		// TODO Auto-generated method stub
		if(deQStack.isEmpty()) {
			if(enQStack.isEmpty()) {
				System.out.print("\nStack is empty");
				return deQStack.pop();
			}
			else
			while(!enQStack.isEmpty())
				deQStack.push(enQStack.pop());
			System.out.print("\nStack dequeued");
			return deQStack.pop();
		}
		System.out.print("\nStack dequeued");
		return deQStack.pop();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		
		if (!enQStack.isEmpty()) {
			System.out.print("\nTop: " + enQStack.peek());
		} else
			System.out.print("\nStack is empty");
		return null;
	}
	
	@Override
	public String toString(){
		LLStack<E> enQStack = this.enQStack;
		StringBuilder str = new StringBuilder();
		System.out.println("\nenQStack: ");
		if (enQStack.isEmpty()) {
			System.out.println("\nStack is empty");
			return str.toString();
			
		}
		while (!enQStack.isEmpty()) {
			return enQStack.toString();
		}
		return str.toString();
	}
	
	public String toString1(){
		LLStack<E> dequeue = this.deQStack;
		StringBuilder str = new StringBuilder();
		System.out.println("\ndeQStack: ");
		if(dequeue.isEmpty()) {
			System.out.print("\nStack is empty");
			return str.toString();
		}
		if (!dequeue.isEmpty()) {
			return deQStack.toString();
		}
		return str.toString();
	}
	
	public String toString2(){
		LLStack<E> enqueue = this.enQStack;
		LLStack<E> dequeue = this.deQStack;
		System.out.println("\nQueue: ");
		if(enqueue.isEmpty()) {
			while (!dequeue.isEmpty()) {
				enQStack.push(deQStack.pop());
			}
			return enQStack.toString();
		}
		while (!enqueue.isEmpty() && !dequeue.isEmpty()) {
			enQStack.push(deQStack.pop());
		}
		return enQStack.toString();
	}
}
