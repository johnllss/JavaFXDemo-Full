package KeyEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
        Parent root = loader.load(); // This will load an object hierarchy from an XML doc.
        Controller controller = loader.getController(); // Has access to any properties and methods in the Controller class
        Scene scene = new Scene(root);

        // One way to listen for key events through this anonymous event handler
        scene.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent event)
            {
                // event.getCode() gets the key pressed

                switch (event.getCode())
                {
                    case UP: controller.moveUp();
                                break;
                    case DOWN: controller.moveDown();
                                break;
                    case LEFT: controller.moveLeft();
                                break;
                    case RIGHT: controller.moveRight();
                                break;
                    default:
                                break;
                }
            }
        });


/*
        USING LAMBA FUNCTION
        scene.setOnKeyPressed(event ->
        {
            // event.getCode() gets the key pressed

            switch (event.getCode())
            {
                case UP: controller.moveUp();
                    break;
                case DOWN: controller.moveDown();
                    break;
                case LEFT: controller.moveLeft();
                    break;
                case RIGHT: controller.moveRight();
                    break;
                default:
                    break;
            }
        });
 */

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}