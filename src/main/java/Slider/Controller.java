package Slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Label myLabel;
    @FXML private Slider mySlider;

    int myTemperature;

    // INVOKED automatically
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // This sets the myLabel text to wherever the knob is placed in the Slider
        myTemperature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(myTemperature) + "C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                // Statements here to implement changer on the temperature
                myTemperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(myTemperature) + "C");
            }
        });
    }
}
