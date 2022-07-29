package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import com.tlglearning.cards.strategy.RankFirstComparator;
import java.security.SecureRandom;
import java.sql.SQLOutput;
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
//    for (Card card : deck) {
//      System.out.println(card);
//    }
    deck.sort();
    System.out.println(deck);

    // sort with new RankFirst Comparator
    deck.sort(new RankFirstComparator());
    System.out.println(deck);

  }

}
