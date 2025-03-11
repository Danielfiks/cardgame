package no.ntnu.idatx2003.oblig4.cardgame.view;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import no.ntnu.idatx2003.oblig4.cardgame.controller.Controller;
import no.ntnu.idatx2003.oblig4.cardgame.model.DeckOfCards;

/**
 * The View class is responsible for displaying the GUI.
 * @author Daniel Wegner Fiksdalstrand
 * @version 0.0.1
 * @since 0.0.1
 */
public class View extends Application {

  // MVC
  private Controller controller;
  private DeckOfCards model;

  //GUI nodes to be updated
  private TextField currentHandTextOutput;
  private TextField sumOfFacesOutput;


  public static void main(String[] args) {
    launch(args);
  }

  /**
   * The method draws the screen when the application is started.
   * @param primaryStage the stage.
   * @throws Exception if its null.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    this.model = new DeckOfCards();
    this.controller = new Controller(model, this);

    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(createCenterPane());
    borderPane.setRight(createRightPane());
    borderPane.getChildren().addAll(createCenterPane(), createRightPane());


    // Create scene and set it on the stage.
    Scene scene = new Scene(borderPane, 640, 450);
    primaryStage.setScene(scene);

    // Set title of the window
    primaryStage.setTitle("Playing card game");

    // Show the window
    primaryStage.show();
  }

  // The rightPane in the window.
  private Pane createRightPane() {
    Button dealHandButton = new Button("Deal hand");
    dealHandButton.setOnAction(event -> {
      this.controller.dealHand();
    });

    Button checkHandButton = new Button("Check hand");
    dealHandButton.setOnAction(event -> {
      this.controller.checkHand();
    });

    FlowPane buttonPane = new FlowPane();
    buttonPane.getChildren().addAll(dealHandButton, checkHandButton);
    buttonPane.setOrientation(Orientation.VERTICAL);
    buttonPane.setVgap(500);


    VBox rightPane = new VBox(10, dealHandButton, checkHandButton);
    rightPane.setAlignment(Pos.CENTER_RIGHT);
    return rightPane;
  }

  // The center pane.
  private Pane createCenterPane() {

    // Create a Text field to display the cards in the hand.
    Label currentHandText = new Label("Your hand will be shown here.");
    this.currentHandTextOutput = new TextField();
    currentHandTextOutput.setEditable(false);

    // Create a Text field to display the sum of the cards in the hand.
    Label sumOfFaces = new Label("Sum of faces:");
    this.sumOfFacesOutput = new TextField();
    sumOfFacesOutput.setEditable(false);

//    Label cardsOfHearts = new Label("Cards of hearts:");
//    TextField cardsOfHeartsOutput = new TextField();
//    sumOfFacesOutput.setEditable(false);

    HBox currentHandPane = new HBox(10, currentHandText, currentHandTextOutput);
    HBox sumOfFacesPane = new HBox(10, sumOfFaces, sumOfFacesOutput);

    FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
    flowPane.getChildren().addAll(currentHandPane, sumOfFacesPane);
    flowPane.setVgap(10);
    flowPane.setAlignment(Pos.CENTER);


    VBox centerPane = new VBox(10);
    centerPane.getChildren().addAll(flowPane);
    return centerPane;
  }

  public void updateHand(String providedHand) {
    this.currentHandTextOutput.setText(providedHand);
  }

  public void updateSumOfFaces(String providedSum) {

    this.sumOfFacesOutput.setText(providedSum);

  }

  @Override
  public void stop() {
    System.exit(0);
  }

}
