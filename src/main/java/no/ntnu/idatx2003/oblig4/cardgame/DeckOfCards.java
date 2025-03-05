package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for holding al the 52 cards.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.2
 * @since 0.0.1 (05.03.25).
 */
public class DeckOfCards {
  private final char[] suits = { 'S', 'H', 'D', 'C' };
  private List<PlayingCard> deck;

  /**
   * The DeckOfCards constructor.
   */
  public DeckOfCards() {
    this.deck = new ArrayList<>();
    fillDeckWithCards();
  }

  private void fillDeckWithCards() {
    int card;

    for (char suit : this.suits) {
      for (card = 1; card < 14; card++) {
        this.deck.add(new PlayingCard(suit, card));
      }
    }

    //Used for testing: Printing the arrayList.
    /*
    for (PlayingCard playingCard : this.deck) {
      System.out.println(playingCard.getAsString());
    }
     */

  }

}
