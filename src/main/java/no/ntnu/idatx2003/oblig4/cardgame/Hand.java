package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class is responsible for storing the players hand.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.3
 * @since 0.0.1 (05.03.25)
 */
public class Hand {
  private final Collection<PlayingCard> playerHand;

  /**
   * The constructor is responsible for initializing the {@link Hand#playerHand} Collection.
   */
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
   * @return a List.
   */
  public List<PlayingCard> getHand() {
    return new ArrayList<>(this.playerHand);
  }

  /**
   * Clears the {@link Hand#playerHand} arrayList.
   */
  public void clearHand() {
    this.playerHand.clear();
  }

}
