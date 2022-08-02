package com.tlglearning.cards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card> {

  // list that will contain multiple cards
  private final List<Card> cards;

  // default random number generator
  private Random defaultRng;

  public Deck() {
    // grab the values from the enums to create arrays
    Suit[] suits = Suit.values();
    Rank[] ranks = Rank.values();
    // when we create an array list, we can give it an initial capacity
    cards = new ArrayList<>(suits.length * ranks.length);
    // Enhanced for loop
    for (Suit suit : suits) {
      for (Rank rank : ranks) {
        // create a card
        Card card = new Card(rank, suit);
        // add it to the deck
        cards.add(card);
      }
    }
  }

  // example of method overloading

  public void shuffle() {
    if (defaultRng == null) {
      defaultRng = new Random();
    }
    shuffle(defaultRng);
  }

  // source of randomness, imported
  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
  }

  // demonstrate a comparator as a strategy in a USES relationship
  public void sort() {
    // invoked with null since no parameters
    sort(null);
    // invokes the one with a parameter
  }

  public void sort(Comparator<Card> comparator) {
    // delegation => a deck HAS-A list of cards called cards. Handing off sorting to this.
    cards.sort(comparator);
  }

  @Override
  public Iterator<Card> iterator() {
    return Collections.unmodifiableList(cards).iterator();
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  public int size() {
    return cards.size();
  }
}
