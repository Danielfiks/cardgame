package no.ntnu.idatx2003.oblig4.cardgame.gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage stage) {
    stage.setTitle("My application");
    stage.show();
  }

  @Override
  public void stop() {
    System.exit(0);
  }

  public static void main(String[] args) {
    launch(args);
  }
}
