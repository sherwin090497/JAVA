package Driver;

import java.util.Scanner;

import Container.StackQ;
import Data.DataClass;

public class Driver {

	@SuppressWarnings("resource")
	public static <E> void main(String[] args) {
		StackQ<DataClass> list = new StackQ<DataClass>();
		String dataName;
//		DataClass data = new DataClass(null, 0);
		Scanner input = new Scanner(System.in);
		String userChoice;

		do {
			System.out.println("\n________________________");
			System.out.println("\nUser Menu:");
			System.out.println("a. Enqueue in the Queue");
			System.out.println("b. Dequeue in the Queue");
			System.out.println("c. Peek from the Queue");
			System.out.println("d. Display the Queue");
			System.out.println("e. Display enQStack and deQStack");
			System.out.println("f. Display Size of the Queue");
			System.out.println("g. Exit");
			System.out.print("Option a to g: ");
			userChoice = input.next();

			switch (userChoice) {

			case "a":

				System.out.print("Insert Data ID to the Enqueue: ");
				if (!input.hasNextInt()) {
					System.out.print("\nNumbers only");
					userChoice = input.next();
					;
					break;
				} else {
					int myQueue = input.nextInt();
					
					System.out.print("Insert String: ");
					dataName = input.next();
					DataClass name = new DataClass(dataName, myQueue);
					list.enQ(name);
				}
				break;

			case "b":
				list.deQ();
				break;

			case "c":
				list.peek();
				break;

			case "d":
				System.out.print(list.toString2());
				break;

			case "e":
				System.out.println(list.toString());
				System.out.print(list.toString1());

				break;

			case "f":
				System.out.print("\nLength of Queue: " + list.length());
				break;
			case "g":
				break;

			default:
				System.out.print("\nNot Valid, Please Enter a Letter Between a to g");
				break;

			}

		} while (!userChoice.equals("g"));
		System.out.println("\nGoodbye!");

	}
}
