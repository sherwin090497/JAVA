/**
 * Program 2b
 * Calls card and their suit when drawn
 * CS108-2 (or CS108-3)
 * 9/16/19
 * Sherwin labadan
 */

import java.util.Random;
public class CardDeck {

    public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private int deckNum = 52;
    public String[] deck = new String[deckNum];
    Random rand = new Random();

    public String getIdentificationString() {
        return "Program 2b, Sherwin Labadan";
    }

    public CardDeck() {
        int i = 0;
        for (String rank : ranks) {
            for (String suit : suits) {
                deck[i++] = rank + " of " + suit;
            }
        }
    }

    public String getCard(int index) {
        return deck[index];
    }

    public String getFirst(){
        return deck[0];
    }

    public String getLast(){
        return deck[deckNum - 1];
    }

    public String randomCard(){
        int n = rand.nextInt(52);
        String x = getCard(n);
        return x;
    }

    public String royalFlush(){
        return getCard(34) + ", " + getCard(38) + ", " + getCard(42) + ", " + getCard(46)+ ", " + getCard(50);
    }



}


