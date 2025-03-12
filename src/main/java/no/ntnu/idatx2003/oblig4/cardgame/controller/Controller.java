package no.ntnu.idatx2003.oblig4.cardgame.controller;

import no.ntnu.idatx2003.oblig4.cardgame.model.DeckOfCards;
import no.ntnu.idatx2003.oblig4.cardgame.model.PlayingCard;
import no.ntnu.idatx2003.oblig4.cardgame.view.View;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {
  // MVC
  private final DeckOfCards model;
  private final View view;

  public Controller(DeckOfCards model, View view) {
    this.model = model;
    this.view = view;
  }

  public void dealHand() {
    this.model.dealHand(5);
    List<String> dealtHand = this.model.getDealtHandAsString();
    String stringOfCards = dealtHand.stream().collect(Collectors.joining(" "));
    this.view.updateHand(stringOfCards);

  }

  public void checkHand() {

    calculateSumOnHand();
  }

  public void calculateSumOnHand() {
    List<Integer> dealtHand = this.model.getDealtHand().stream().map(PlayingCard::getFace).toList();
    int sum = dealtHand.stream().mapToInt(Integer::intValue).sum();
    this.view.updateSumOfFaces("" + sum);
  }

}
