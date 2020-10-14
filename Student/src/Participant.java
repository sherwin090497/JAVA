public class Participant {
  
  //Instance Variables
  private String name;
  private int weight;
  private double height;
  
  //Constructor
  public Participant() {
    
    name = "Joe Schmoe";
    this.setWeight(200);
    this.setHeight(6.0);
    
  }
  //second constructor taking one parameter for string to set name
  public Participant(String theName) {
    name = theName; 
    this.setWeight(200);
    this.setHeight(6.0);
  }
  /*third constructor taking three parameter for string,
   * int, double, to set name, weight, and height. If weight or height 
   * is negative, then it will set to default.
   * 
   */
  
  public Participant(String theName, int theWeight, double theHeight) {
    
    name = theName;
    if (theWeight > 0) {
      this.setWeight(theWeight);
    }
    else if (theWeight < 0 ) {
    	System.out.println("Incorrect weight, weight must be positive. Weight will be set to default value(200)");
    	 this.setWeight(200);
    	
    }
    
    if (theHeight > 0) { 
     this.setHeight(theHeight);
    } 
     else if (theHeight < 0) {
    	 System.out.println("Incorrect height, height must be positive. Height will be set to defalut value(6.0)");
    	 this.setHeight(6.0);
    }
  }
  
  public double getBMI() {
    return weight  / (Math.pow(height, 2)) *703;
  }
 
  
  public String getName() {
    return name; 
    
  }
  
  public void setName(String newName) {
	    name = newName; 
	    
	  }
  
  public int getWeight() {
    return weight;
    
  }
  
  public void setWeight(int newWeight) {
	    if ( newWeight > 0) {
	      weight = newWeight;
	    }
	    else {
	    	System.out.println("Incorrect weight, weight must be positive. Weight will not be updated.");
	    }
	  }
  
  public double getHeight() {
    return height;
    
  }
  
  public void setHeight(double newHeight) {
	    if (newHeight > 0) {
	      height = newHeight;
	    }
	    else {
	    	System.out.println("Incorrect height, height must be positive. Height will not be updated.");
	    }
  }
  
  public String toString() {
	  return "Participant:\nName: " + 
			  this.name + "\nWeight: " +
			  this.weight + "\nHeight: " +
			  this.height + "\n";
  }
}
 