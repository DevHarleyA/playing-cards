package com.tlglearning.cards.model;

public enum Suit {

  // CAN'T DECLARE ANYTHING BEFORE LIST OF ENUMERATED VALUES, MUST END WITH SEMICOLON
  CLUBS('\u2663'),
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol;

  Suit(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return symbol;
  }

  // no setter for final field, not valid
}
