package Classes;

public class Student extends Person{

	private int ID;
	
	public Student(int ID, String name, int age){
		super(name, age);
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}
	
	public int setID(int ID) {
		return this.ID = ID;
}
	
	public void printInfo(){
		System.out.print("\nID: " + this.getID());
		System.out.print(" \t");
		System.out.print("Name: " + this.getName());
		System.out.print(" \t");
		System.out.print("Age: " + this.getAge());

	}
	
}
