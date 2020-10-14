package ArrayImplementations;


public class StackArray<E> {
	
	    private int top=-1;
	    private static final int MAX_ITEMS = 10;
	    private E items[];
	 
	    @SuppressWarnings("unchecked")
		public StackArray() {
	        items = (E[]) new Object[MAX_ITEMS];
	        System.out.println("\nStack Created!");
	    }
	 
	    public void push(E e) {
	        if (isFull()==true) {
	           System.out.println("Stack Full!");
	        }
	        else{
	        	top=top+1;
	        	items[top] = e;
	        }
	    }
	 
	  
	    public E pop() {
	    	 if (isEmpty()==true) {
		           System.out.println("Stack Empty!");
		        }
	    	 else{
	    	
	        E e = (E) items[top];
	        items[top] = null;
	        top = top-1;
	        return e;
	    	 }
			return null;
	    }
	 
	    public boolean isFull() {
	    	 if (top == items.length-1) {
	    		 return true;
	    	 }
	    	 return false;
	    }
	    
	    public boolean isEmpty(){
	    	 if (top==-1) {
	    		 return true;
	    	 }
	    	 return false;
	    }
	    
	     
	    @Override
	    public String toString()
	    {
	    	System.out.println("\nArray:");
	        System.out.print("{");
	         for(int i = 0; i < items.length ;i++) {
	             System.out.print(items[i]+" ");
	    }
	         System.out.print("}");
			return "";
	}
	    public static void main(String[] args) 
	    {
	    	
	    	// Code reference for countPosNeg method
	    	StackArray<Integer> intStack = new StackArray<Integer>();
	    	 	intStack.push(10);
		        intStack.push(10);
		        intStack.push(30);
		        intStack.push(-40);
				// call countPosNeg here
		        intStack.countPosNeg(intStack);    									// Solution to 2a.3
		        
		        System.out.println("\nintStack before counting");
		        System.out.println(intStack);
	    	
		        System.out.println("\nintStack after counting");
		        System.out.println(intStack);
		        
	    	// Code reference for sameStack method
	       StackArray<Integer> stack = new StackArray<Integer>();
	       StackArray<Integer> stack2 = new StackArray<Integer>();
	 
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack2.push(10);
	        stack2.push(20);
	        stack2.push(30);
	        stack2.push(40);
	         
	       
	        System.out.println(stack);
	        System.out.println(stack2);
	        
	        //Calling comparison method
	       // stack.sameStack(stack2); 
	        if (sameStack(stack, stack2)) 
	            System.out.println("\nStacks are Same"); 
	        else
	            System.out.println("\nStacks are not Same"); 
	    }
	    
	    static boolean sameStack(StackArray<Integer> stack, StackArray<Integer>  stack2) {     // Solution to 2b
			boolean flag = true;
			 while (stack.isEmpty() == false) { 
			      int x = stack.pop();
			      int y = stack2.pop();
				 if (x == y) { 
			            flag = true;
			        } 
			        else { 
			            flag = false; 
			            break; 
			        } 
			    } 
			    return flag; 
			} 
			

		public void countPosNeg(StackArray<Integer> intStack) {      				// Solution to 2a.1
	    	StackArray<Integer> temporaryStack = new StackArray<Integer>();
	    	int x;
	    	int neg = 0, pos = 0;
	    	while (!intStack.isEmpty()) {
	    		x = intStack.pop();
	    		temporaryStack.push(x);
	    		if (x < 0) {
	    			neg++;
	    		}
	    		else {
	    		pos++;
	    		}
	    	}
	    	System.out.println("Negative: " + neg + " \nPositive: " + pos);
	    	while (!temporaryStack.isEmpty()) {
	    		x = temporaryStack.pop();
	    		intStack.push(x);
	    	}
	    }
}