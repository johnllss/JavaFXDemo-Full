package ListView;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Label myLabel;
    @FXML private ListView<String> myListView;

    String[] food = {"pizza", "sushi", "ramen"};
    
    String currentFood;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        myListView.getItems().addAll(food);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>()
        {
            // This, and the usage of this in all previous lessons with interface Initializable, is called whenever something is selected in the specified Class and changes the myLabel
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue)
            {
                currentFood = myListView.getSelectionModel().getSelectedItem();

                myLabel.setText(currentFood);
            }
        });
    }
}
