package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Comparator;
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
    deck.sort(new Comparator<Card>() {

      @Override
      public int compare(Card card1, Card card2) {
        // Relying on the Rank Enum to know how to compare each other.
        int comparison = card1.getRank().compareTo(card2.getRank());
        if (comparison == 0) {
          comparison = card1.getSuit().compareTo(card2.getSuit());
        }
        return comparison;
      }
    });

    System.out.println(deck);

  }

}
