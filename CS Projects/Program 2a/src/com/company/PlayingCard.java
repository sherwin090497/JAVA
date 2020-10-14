/**
 * Program 2a
 * Prints the card number and the suit
 * CS108-2 (or CS108-3)
 * 9/15/19
 * Sherwin labadan
 */

public class PlayingCard {

    public String rank;
    public String suit;

    public String getIdentificationString() {
        return "Program 2a, Sherwin Labadan";
    }

    public PlayingCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String goodCard(String rank) {
        if (rank == "Ace") {
            return ("That's a good card!");
        }
        if (rank == "Jack") {
            return ("That's a good card!");
        }
        if (rank == "Queen") {
            return ("That's a good card!");
        }
        if (rank == "King") {
            return ("That's a good card!");
        }
        if (rank == "10") {
            return ("That's a good card!");
        }
        else
            return "This card is alright.";
    }

    public String getRank(String cardNum) {
        if (cardNum == "Ace"){
            return "Ace";
        }
        if (cardNum == "2"){
            return "2";
        }
        if (cardNum == "3"){
            return "3";
        }
        if (cardNum == "4"){
            return "4";
        }
        if (cardNum == "5"){
            return "5";
        }
        if (cardNum == "6"){
            return "6";
        }
        if (cardNum == "7"){
            return "7";
        }
        if (cardNum == "8"){
            return "8";
        }
        if (cardNum == "9"){
            return "9";
        }
        if (cardNum == "10"){
            return "10";
        }
        if (cardNum == "Jack"){
            return "Jack";
        }
        if (cardNum == "Queen"){
            return "Queen";
        }
        if (cardNum == "King"){
            return "King";
        }
        return "none";
    }

    public String getSuit(String cardSuit) {
        if (cardSuit == "Clubs") {
            return "Clubs";
        }
        else if (cardSuit == "Hearts") {
            return "Hearts";
        }
        else if (cardSuit == "Diamonds") {
            return "Diamonds";
        }
        else if (cardSuit == "Spades") {
            return "Spades";
        }
        else {
            return "none";
        }
    }
    public String toString(){
        return rank + " of " + suit;
    }

    public String getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard("3", "Clubs");
        System.out.println(card.toString());
        System.out.println(card.getRank());
        System.out.println(card.getSuit());
    }

}


