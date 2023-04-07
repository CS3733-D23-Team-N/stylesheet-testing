package edu.wpi.teamname.controllers;

import com.sun.javafx.collections.ImmutableObservableList;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

public class HomeController {

  @FXML
  MFXComboBox<String> comboBox;

  @FXML
  MFXFilterComboBox<String> filterComboBox;

  @FXML
  public void initialize() {
    ObservableList<String> list = new ImmutableObservableList<>("one", "two", "three", "four");
    comboBox.setItems(list);
    filterComboBox.setItems(list);
  }
}
