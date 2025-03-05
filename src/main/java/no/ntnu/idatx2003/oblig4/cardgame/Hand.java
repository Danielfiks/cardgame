package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This class is responsible for storing the players hand.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.1
 * @since 0.0.1 (05.03.25)
 */
public class Hand {
  private Collection<PlayingCard> playerHand;

  public Hand () {
    this.playerHand = new ArrayList<>();

  }

  /**
   * The class adds cards to the players hand.
   * @param providedCard the received card which is added to the hand.
   * @throws IllegalArgumentException if {@link #addToHand(PlayingCard) providedCard} is null.
   */
  public void addToHand(PlayingCard providedCard) {
    if (providedCard == null) {
      throw new IllegalArgumentException("The card cannot me null");
    }
    this.playerHand.add(providedCard);
  }

  /**
   * Return the contents of the hand.
   * @return an iterator of the hand.
   */
  public Iterator<PlayingCard> getHand() {
    return this.playerHand.iterator();
  }

  /**
   * Clears the {@link Hand#playerHand} arrayList.
   */
  public void clearHand() {
    this.playerHand.clear();
  }

}
