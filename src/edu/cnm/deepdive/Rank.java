package edu.cnm.deepdive;

public enum Rank {

  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEEN,
  EIGHT,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING;

  private static final String[] symbols =
      {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

  public String symbol() {
    return symbols[ordinal()];
  }

}
