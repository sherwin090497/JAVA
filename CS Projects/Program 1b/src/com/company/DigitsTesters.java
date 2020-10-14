/**
 * Program #1b
 * Digits - Finds the first, last and number of the given digits
 * CS108-2 (or CS108-3)
 * 9/8/19
 * Sherwin labadan
 */


public class DigitsTesters {
    public static void main(String[] args) {
        Digits d = new Digits();

        int ds = d.digits(-1729);
        int f = d.firstDigit(-1729);
        int l = d.lastDigit(-1729);

        System.out.println("Number of first digits: " + f);
        System.out.println("Number of last digits: " + l);
        System.out.println("Number of digits: " + ds);
    }
}
