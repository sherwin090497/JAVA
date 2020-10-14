
import java.util.Scanner;

import Classes.Student;

public class CreateMultipleShapes {

	public static void main(String[] args) {
		String myShape[] = new String[10];
		Scanner shapeNumber = new Scanner(System.in);

		System.out.print("Number of shape do you want?");
		int numberShapes = shapeNumber.nextInt();

		for(int i = 1; i < numberShapes; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println("Enter X Coordinate: ");
				int x = shapeNumber.nextInt();
				System.out.println("Enter y Coordinate: ");
				int y = shapeNumber.nextInt();
				CreateMultipleShapes(x, y);
			}
		}
	}

	private static void CreateMultipleShapes(int x, int y) {
		
	}

	int x, y;
	
	public CreateMultipleShapes(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getx() {
		return x;
	}
	
	public int setx(int x) {
		return this.x = x;
	}
	
	public int gety() {
		return y;
	}
	
	public int sety(int y) {
		return this.y = y;
	}
	
	public void printInfo(){
		System.out.print("\nX - Coordinate: " + this.x);
		System.out.print(" \t");
		System.out.print("\nY - Coordinate: " + this.y);

	}
}
