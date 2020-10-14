package MainClass;
import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		Scanner Counter = new Scanner(System.in);
		
		for (int i = 1; i < i + 1; ++i) {
			System.out.print("\n\nCounter: ");
			int counting = Counter.nextInt();
			if (counting == 1) {
				System.out.print("\nShe said \"For example\" " + i + " times");
			}
		}
	}

}