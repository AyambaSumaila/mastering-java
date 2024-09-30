package HowToProgramJava;

import java.security.SecureRandom;

public class DeckOfCards {

    private Card deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS=52;
    private static final SecureRandom randomNumbers=new SecureRandom();
    String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    //deck=new Card[NUMBER_OF_CARDS];

}
