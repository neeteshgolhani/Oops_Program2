package deckofcards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*This implementation assumes that there is a Card class with rank and suit fields
that represent the rank and suit of a playing card. The DeckOfCards class has a constructor
that initializes the deck of cards with all 52 cards, a shuffle() method that shuffles
the deck using the Collections.shuffle() method with a Random object,
and a dealCards() method that deals a specified number of cards to a specified number of players.
 The dealCards() method returns a 2D array that represents the cards received by each player.*/
public class DeckOfCards {
    private ArrayList<Card> deck;

    // Constructor that initializes the deck of cards
    public DeckOfCards() {
        deck = new ArrayList<>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create all 52 cards in the deck
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to shuffle the deck using Random method
    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }

    // Method to deal cards to players
    public Card[][] dealCards(int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.size()) {
            throw new IllegalArgumentException("Not enough cards in the deck to deal to all players");
        }

        Card[][] hands = new Card[numPlayers][numCards];

        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                hands[j][i] = deck.remove(0);
            }
        }

        return hands;
    }
}
