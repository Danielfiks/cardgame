package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * This class is responsible for holding al the 52 cards.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.3
 * @since 0.0.1 (05.03.25).
 */
public class DeckOfCards {
  private final char[] suits = { 'S', 'H', 'D', 'C' };
  private List<PlayingCard> deck;
  private Collection<PlayingCard> hand;
  private Random rand;

  /**
   * The DeckOfCards constructor.
   */
  public DeckOfCards() {
    this.deck = new ArrayList<>();
    this.hand = new ArrayList<>();
    this.rand = new Random();
    fillDeckWithCards();
    assign();
    printArray();
  }

  private void fillDeckWithCards() {
    int card;

    for (char suit : this.suits) {
      for (card = 1; card < 14; card++) {
        this.deck.add(new PlayingCard(suit, card));
      }
    }
  }

  private void assign() {
    int i;
    for (i = 0 ; i < 5 ; i++) {
      this.hand.add(dealHand(this.rand.nextInt(53)));
    }
  }

  private PlayingCard dealHand(int n) {
    return this.deck.get(n);
  }

  private void printArray() {
    //Used for testing: Printing the arrayList.
    for (PlayingCard playingCard : this.hand) {
      System.out.println(playingCard.getAsString());
    }
  }

}
