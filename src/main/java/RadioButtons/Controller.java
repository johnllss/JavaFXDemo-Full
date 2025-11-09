package RadioButtons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
    @FXML private Label myLabel;
    @FXML private RadioButton ourButton1, ourButton2, ourButton3;

    public void getFood(ActionEvent event) {
        if (ourButton1.isSelected())
        {
            myLabel.setText(ourButton1.getText());
        }
        else if (ourButton2.isSelected())
        {
            myLabel.setText(ourButton2.getText());
        }
        else if (ourButton3.isSelected())
        {
            myLabel.setText(ourButton3.getText());
        }
    }
}
