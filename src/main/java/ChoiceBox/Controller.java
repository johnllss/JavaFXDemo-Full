package ChoiceBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Label myLabel;
    @FXML private ChoiceBox<String> myChoiceBox; // <String> is needed to prevent error

    private final String[] food = {"pizza", "sushi", "ramen"};


    // This is required to be able to populate an unpopulatable ChoiceBox
    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood); // this:: is a method reference operator; makes a reference to the specified method and links it to the myChoiceBox
    }

    public void getFood(ActionEvent event)
    {
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood); // the setOnAction(0 then connects here to change the myLabel
    }
}
