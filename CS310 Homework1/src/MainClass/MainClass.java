package MainClass;

import Classes.Student;
import Interfaces.StudentMethods;
import java.util.Scanner;

public class MainClass implements StudentMethods {

	public static void main(String[] args) {
		Student studentArray[] = new Student[10];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int userChoice;
		int numStudent = 0;

		do {
			System.out.println("\n\nUser Menu:");
			System.out.println("1. Insert Student");
			System.out.println("2. Delete Student by ID");
			System.out.println("3. Search Student by ID");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			System.out.println("Enter a number choice: ");
			userChoice = input.nextInt();
			if (userChoice != 1 && userChoice != 2 && userChoice !=3 && userChoice !=4 && userChoice !=5) {
				System.out.print("\nNot Valid, Please Enter Number Between 1 to 5");
			}
			if (userChoice == 1) {

				if (numStudent == 10) {
					System.out.print("\nList is full");
				} else {

					System.out.print("Insert Student ID: ");
					int studentID = input.nextInt();
					System.out.print("Insert Student Name: ");
					String studentName = input.next();
					System.out.print("Insert Student Age: ");
					int studentAge = input.nextInt();
					boolean List = false;
					for (int i = 0; i < studentArray.length; i++) {
						if (studentArray[i] != null) {
							int matchID = studentArray[i].getID();
							if (matchID == studentID) {
								List = true;
							}
						}
					}
					if (List) {
						System.out.print("\nID already exists");
					} else {
						Student student = new Student(studentID, studentName, studentAge);
						studentArray[numStudent] = student;
						numStudent++;
						System.out.print("\nStudent Inserted!");
					}
				}
			}

			if (userChoice == 2) {
				System.out.println("Insert student Id to delete: ");
				int studentID = input.nextInt();
				boolean List = false;
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] != null) {
						int matchID = studentArray[i].getID();
						if (matchID == studentID) {
							List = true;
						}
					}
				}
				if (!List) {
					System.out.print("\nStudent not found");
				}
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] != null) {
						if (studentArray[i].getID() == studentID) {
							studentArray[i].printInfo();
							studentArray[i] = null;
							System.out.print("\nStudent Removed");
							if (List) {
								numStudent--;
								break;
							}
						}
					}
					continue;
				}
			}

			if (userChoice == 3) {
				System.out.println("Input Student ID to Search: ");
				MainClass mainClass1 = new MainClass();
				String searchID = input.next();
				mainClass1.searchStudent(searchID, studentArray);
				
			}

			if (userChoice == 4) {
				MainClass mainClass = new MainClass();
				boolean List = true;
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] != null) {
						List = false;
					}
				}
				if (List) {
					System.out.print("\nList does not exists");
				}
				mainClass.displayAll(studentArray);
			}

		}

		while (userChoice != 5);
		System.out.print("Goodbye!");

	}

	@Override
	public void displayAll(Student studentArray[]) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				studentArray[i].printInfo();
			}
		}
	}
	
    @Override
    public void searchStudent(String id, Student studentArray[]) {
    	boolean List = false;
    	for(int i = 0 ; i < studentArray.length ; i++){
            if(studentArray[i] != null) {
                if (studentArray[i].getID() == Integer.parseInt(id)) {
                    studentArray[i].printInfo();
                    List = true;
                }
            }
        }
    	if (!List) {
			System.out.print("\nStudent not found");
		}
    }
}
