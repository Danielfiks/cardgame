package no.ntnu.idatx2003.oblig4.cardgame;

import no.ntnu.idatx2003.oblig4.cardgame.model.PlayingCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class is for testing the {@link PlayingCard} class.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.2
 * @since 0.0.1 (04.03.25)
 */
class PlayingCardTest {
  PlayingCard card;

  @BeforeEach
  void init() {
    this.card = new PlayingCard('H',1);
  }

  @Test
  void checkGetAsString() {
    Assertions.assertEquals("H1", this.card.getAsString());
  }

  @Test
  void checkGetSuit() {
    Assertions.assertEquals('H', this.card.getSuit());
  }

  @Test
  void checkGetFace() {
    Assertions.assertEquals(1, this.card.getFace());
  }

  @Test
  void checkForNegativeValues() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> this.card = new PlayingCard('I', 4));
    Assertions.assertThrows(IllegalArgumentException.class, () -> this.card = new PlayingCard('H', -4));
  }

}