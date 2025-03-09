package no.ntnu.idatx2003.oblig4.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class is responsible for holding al the 52 cards.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.6
 * @since 0.0.1 (05.03.25).
 */
public class DeckOfCards {
  private final char[] suits = { 'S', 'H', 'D', 'C' };
  private List<PlayingCard> deck;
  private final Hand playerHand;
  private Random rand;

  /**
   * The DeckOfCards constructor.
   */
  public DeckOfCards() {
    this.deck = new ArrayList<>();
    this.playerHand = new Hand();
    this.rand = new Random();
    fillDeckWithCards();
//    printHand();
//    printDeck();
  }

  /**
   * The method fills the {@link DeckOfCards#deck deck} with {@code 52} unique cards.
   */
  public void fillDeckWithCards() {
    for (char suit : this.suits) {
      for (int card = 1; card < 14; card++) {
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

  //Used for debug: Printing the hand.
//  private void printHand() {
//    this.playerHand.getHand().forEach(x -> System.out.println(x.getAsString()));
//  }

  //Used for debug: Printing the hand.
//  private void printDeck() {
//    for (PlayingCard playingCard : this.deck) {
//      playingCard.getAsString();
//    }
//  }

}
