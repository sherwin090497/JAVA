import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DiceGame {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		Scanner myNum = new Scanner(System.in);
		System.out.println("Dice Game");

		for (;;) {
			System.out.print("\nEnter a number from 2 to 12: ");
			int playerNum = myNum.nextInt();
			if (playerNum > 12 || playerNum < 2) {
				System.out.println("Enter numbers from 2 to 12 only\nplease try again");
			} else {

				System.out.println("\nRolling dice...\n");
				TimeUnit.SECONDS.sleep(2);
				int computerDice = rand.nextInt(11) + 2;
				System.out.println("Computer got: " + computerDice);
				TimeUnit.SECONDS.sleep(1);
				if (playerNum != computerDice) {
					System.out.println("\nYou lose");
				} else {
					System.out.println("\nYou Win!");
					System.out.println("Congrats for wasting your life playing this game!");
				}
			}
		}
	}
}
