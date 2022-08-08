/*
author: griffin
purpose of this class is to define a Card object that is immutable.
props - face value which represents a value of the card
        suit which represents the suit of the card like heards or spades. using an 
        int to make it easier to compare cards later.
*/
public class Card 
{
  // creating these as class level static strings for the toString override
  // jack, king, queen are 11,12,13 respectively;
  public static final String[] FACEVALUES = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};
  
// suits correspond to an integer to be passed to constructor;
  public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};
  
  // making the properties here final because we want the cards to be immutable
  private final int faceValue;
  private final int suit;

  // Constructor;
  public Card(int faceValue, int suit)
  {
    this.faceValue = faceValue;
    this.suit = suit;
  }

  // overriding the to string method
  @Override
  public String toString() 
  {
    return FACEVALUES[this.faceValue] + " of " + SUITS[this.suit];
  }
  
}