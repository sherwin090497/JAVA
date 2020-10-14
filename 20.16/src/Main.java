
/**
 * Program 20.16
 * <p>
 * CS108-2 (or CS108-3)
 * 9/24/19
 * Sherwin labadan
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of legs: ");
        int x = input.nextInt();
        Chair myChair = new SpinningChair(x);
        System.out.println("Number of legs: " + myChair.getNumberOfLegs());
        System.out.println("Cost of the Chair: " + myChair.getCost());
    }
}

class Chair {
    public int NumberOfLegs = 4;
    public int Cost = 5;
    public int newCost;
    public int newLeg;

    public int getNumberOfLegs() {

        return newLeg = NumberOfLegs;
    }

    public int getCost() {

        return newCost = Cost * NumberOfLegs;
    }
}

class SpinningChair extends Chair {

    public SpinningChair(int numberOfLegs) {
        if (numberOfLegs < 3) {
            throw new RuntimeException("Not Available");
        }
        NumberOfLegs = numberOfLegs;
    }
}

class BackrestChair extends Chair {
    private int Cost = 7;

    public int getNumberOfLegs() {
        return newLeg = NumberOfLegs;
    }

    public int getCost() {
        return newCost = Cost * NumberOfLegs;
    }
}

