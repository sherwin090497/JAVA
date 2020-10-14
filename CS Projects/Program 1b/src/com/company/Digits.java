/**
 * Program #1b
 * Digits - Finds the first, last and number of the given digits
 * CS108-2 (or CS108-3)
 * 9/8/19
 * Sherwin labadan
 */

public class Digits {
    private int digits;
    private int firstDigit;
    private int lastDigit;

    public int firstDigit(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        while (n >= 10) {
            n = n / 10;
            firstDigit = n;
        }
        return firstDigit;
    }

    public int lastDigit(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        lastDigit = n % 10;
        return lastDigit;
    }

    public int digits(int n) {
        if (n < 0) {
            Math.abs(n);
            while (n != 0) {
                n = n / 10;
                ++digits;
            }
            return digits;
        } else if (n == 0)
            return 1;
        else {
            while (n != 0) {
                n = n / 10;
                ++digits;
            }
            return digits;
        }

    }

}
