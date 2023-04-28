package deckofcards;
public class Deck {
        public static void main(String[] args) {
            // Create a new DeckOfCards object
            DeckOfCards deck = new DeckOfCards();

            // Shuffle the deck
            deck.shuffle();

            // Create an array of Player objects, each with a unique name
            Player[] players = {new Player("Player 1"), new Player("Player 2"), new Player("Player 3"), new Player("Player 4")};

            // Set the number of players and number of cards each player should have
            int numPlayers = players.length;
            int numCards = 9;

            // Deal cards to each player and store the hands in a 2D array
            Card[][] hands = deck.dealCards(numPlayers, numCards);

            // Print out each player's hand
            for (int i = 0; i < numPlayers; i++) {
                System.out.println(players[i].getName() + "'s cards:");
                for (int j = 0; j < numCards; j++) {
                    System.out.println(hands[i][j].getRank() + " of " + hands[i][j].getSuit());
                }
                System.out.println();
            }
        }
    }
