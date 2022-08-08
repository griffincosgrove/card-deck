class Main {
  public static void main(String[] args) 
  {
    //Card newCard = new Card(1,0);
    //System.out.println(newCard);
    Deck deck1 = new Deck();
    deck1.shuffle();
    for (int i=0; i<55; i++)
    {
    System.out.println(deck1.dealOneCard());
    }
  }
}