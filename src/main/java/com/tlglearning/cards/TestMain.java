package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class TestMain {

  public static void main(String[] args) {
    // Create a new deck of cards
    Deck deck = new Deck();
    // SecureRandom is a subclass of random. It compiles.
    Random rng = new SecureRandom();
    // invoke toString method to get the string representation of the deck
    System.out.println(deck);
    // now let's shuffle the deck and pass our source of randomness
    deck.shuffle(rng);
    // print it out again
    System.out.println(deck);
    // iterate through the cards
    for (Card card : deck) {
      System.out.println(card);
    }

  }

}
