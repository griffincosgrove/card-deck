/*
author: griffin
purpose of this class is to define a deck object.
props - cards - ArrayList of cards which represents a deck (52) of cards
        cardStack - Stack of cards from which cards are dealt from in the LiFo order
        random - instantiating random
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
  
public class Deck
{
  // initializing random instance;
  private static final Random random = new Random();
  // going with an array list so we can write to a stack easier
  private ArrayList<Card> cards;
  /*
    going with a stack to contain the shuffled deck. doing this because i think it will       be faster over the long term with all of the add and remove operations
  */
  private Stack<Card> cardStack = new Stack<Card>();

  //constructor
  public Deck() 
  {
    this.cards =  new ArrayList<Card>(52);
    int index = 0;
    for (int suit = 0; suit <= 3; suit++) 
    {
        for (int faceValue = 1; faceValue <= 13; faceValue++) 
        {
            this.cards.add(index, new Card(faceValue, suit));
            index++;
        }
    }
  }
   private static int randomInt(int low, int high)
   {
      /* i am reading there are other ways to generate random numbers, but this one          seems more simple
     */
      return random.nextInt(Math.max(high,low) - Math.min(high,low) + 1) + low;
   }
  private void swapCards(int i, int j) 
  {
      Card temp = cards.get(i);
      cards.set(i, cards.get(j));
      cards.set(j, temp);
  }

  // only to be called on the shuffled deck
  private void createStack()
  {
    for (int i=0; i<cards.size(); i++)
    {
      cardStack.push(cards.get(i));
    }
  }
  
  public void shuffle() 
  {
    for (int i=0;i<cards.size();i++)
    {
      swapCards(i, randomInt(i, cards.size() - 1));
    }
    createStack();
  }

  // deals a card, if stack empty return null
  public Card dealOneCard()
  {
    if (cardStack.empty())
      {
        System.out.println("Deck is Empty!");
        return null;
      }
    else
    {
      return cardStack.pop();
    }
  }
}
