package BindingProperties;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Created by Ruben on 7/17/2015.
 */
public class BindMain extends Application{

    Stage window;
    Scene scene;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("title");

        TextField userInput = new TextField();
        userInput.setMaxWidth(200);

        Label firstLabel = new Label();

        firstLabel.textProperty().bind(userInput.textProperty());


        VBox layout = new VBox(10, userInput, firstLabel);
        layout.setAlignment(Pos.CENTER);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
