package no.ntnu.idatx2003.oblig4.cardgame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class is for testing the {@link Hand} class.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.1
 * @since 0.0.1 (08.03.25)
 */
class HandTest {
  Hand playerHand;
  PlayingCard testCard;

  @BeforeEach
  void init() {
    this.playerHand = new Hand();
    this.testCard = new PlayingCard('H',3);
  }

  /**
   * Test if the {@link Hand#getHand() getHand} method retrieves the card.
   */
  @Test
  void checkGetHand() {
    this.playerHand.addToHand(this.testCard);
    Assertions.assertEquals(this.playerHand.getHand().getFirst(), this.testCard);
  }

  /**
   * Tests that an IllegalArgumentException is thrown if {@code null} is provided to the addToHand method.
   */
  @Test
  void checkAddToHandException() {
    Assertions.assertThrows(IllegalArgumentException.class,
            () -> this.playerHand.addToHand(null));
  }

  /**
   * Check if the {@link Hand#clearHand() clearHand} method clears the List.
   */
  @Test
  void checkClearHand() {
    this.playerHand.addToHand(this.testCard);
    this.playerHand.clearHand();
    Assertions.assertTrue(this.playerHand.getHand().isEmpty());
  }

}
