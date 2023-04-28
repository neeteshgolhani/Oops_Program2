package deckofcards;

public class Card {
    private String suit; // declare a private instance variable suit of type String
    private String rank; // declare a private instance variable rank of type String

    // Constructor
    public Card(String suit, String rank) { // constructor that takes two arguments, suit and rank
        this.suit = suit; // set the value of the private instance variable suit to the value of the suit argument
        this.rank = rank; // set the value of the private instance variable rank to the value of the rank argument
    }

    // Getters
    public String getSuit() { // getter method that returns the value of the private instance variable suit
        return suit;
    }

    public String getRank() { // getter method that returns the value of the private instance variable rank
        return rank;
    }
}