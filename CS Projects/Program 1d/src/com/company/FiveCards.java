/**
 * Program #1d
 * Selects 5 random cards
 * CS108-2 (or CS108-3)
 * 9/9/19
 * Sherwin labadan
 */

import java.util.Random;
import java.util.Arrays;

public class FiveCards {
    public static void main(String[] args) {
        getInfo();
        int[] hand1 = initHand(52, 5, 1111);
        showHand(hand1);
        System.out.println();
        sameSuit(hand1);
    }

    public static String getInfo() {
        return "Program 1, Student Name";
    }

    public static int[] initHand(int deckSize, int handSize, long randomGeneratorSeed) {
        Random rand = new Random(randomGeneratorSeed);
        int[] cardType = new int[handSize];
        cardType[0] = -1;
        cardType[1] = -1;
        cardType[2] = -1;
        cardType[3] = -1;
        cardType[4] = -1;
        for (int i = 0; i < handSize; ) {
            int temp = rand.nextInt(deckSize);
            if (check(cardType, temp)) {
                cardType[i] = temp;
                i++;
            }
        }
        return cardType;
    }

    public static boolean check(int[] hand, int num) {
        for (int i = 0; i < 5; i++) {
            if (hand[i] == num)
                return false;
        }
        return true;
    }

    public static void showHand(int[] hand) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getCardValue(hand[i]));
        }
    }

    public static String getCardValue(int cardNumber) {
        String value = getRank(cardNumber);
        String suit = getSuit(cardNumber);
        String final_str = value + " of " + suit;
        return final_str;
    }

    public static String getSuit(int cardNumber) {
        String suitType = "";
        if (cardNumber < 13) {
            suitType = "Clubs";
        } else if (cardNumber < 26) {
            suitType = "Diamonds";
        } else if (cardNumber < 39) {
            suitType = "Hearts";
        } else if (cardNumber < 52) {
            suitType = "Spades";
        }
        return suitType;
    }

    public static String getRank(int cardNumber) {
        String rankType = "";
        cardNumber = cardNumber % 13;
        switch (cardNumber) {
            case 0:
                rankType = "Ace";
                break;
            case 1:
                rankType = "Two";
                break;
            case 2:
                rankType = "Three";
                break;
            case 3:
                rankType = "Four";
                break;
            case 4:
                rankType = "Five";
                break;
            case 5:
                rankType = "Six";
                break;
            case 6:
                rankType = "Seven";
                break;
            case 7:
                rankType = "Eight";
                break;
            case 8:
                rankType = "Nine";
                break;
            case 9:
                rankType = "Ten";
                break;
            case 10:
                rankType = "Jack";
                break;
            case 11:
                rankType = "Queen";
                break;
            case 12:
                rankType = "King";
                break;
        }
        return rankType;
    }



    public static void sameSuit(int[] hand) {
        Arrays.sort(hand);
        int clubs = 0;
        int diamonds = 0;
        int spades = 0;
        int hearts = 0;
        int[] club = new int[5];
        int[] diamond = new int[5];
        int[] spade = new int[5];
        int[] heart = new int[5];
        for (int i = 0; i < 5; i++) {
            if (hand[i] < 13) {
                club[clubs] = hand[i];
                clubs++;

            } else if (hand[i] < 26) {
                diamond[diamonds] = hand[i];
                diamonds++;
            } else if (hand[i] < 39) {
                heart[hearts] = hand[i];
                hearts++;
            } else if (hand[i] < 52) {
                spade[spades] = hand[i];
                spades++;
            }
        }
        if (clubs >= 2) {
            for (int i = 0; i < clubs; i++)
                System.out.println(getCardValue(club[i]));
        }
        if (diamonds >= 2) {
            for (int i = 0; i < diamonds; i++)
                System.out.println(getCardValue(diamond[i]));
        }
        if (hearts >= 2) {
            for (int i = 0; i < hearts; i++)
                System.out.println(getCardValue(heart[i]));
        }
        if (spades >= 2) {
            for (int i = 0; i < spades; i++)
                System.out.println(getCardValue(spade[i]));
        }
    }
}