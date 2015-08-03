package CSSFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/15/2015.
 */
public class cssMain extends Application{

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("CSS and JavaFX");
        GridPane layout = new GridPane();
        layout.setVgap(10);
        layout.setHgap(5);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Label usernameLabel = new Label("Username: ");
        GridPane.setConstraints(usernameLabel, 0, 0);
        usernameLabel.setId("bold-label");

        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField userName = new TextField();
        userName.setPromptText("Username");
        GridPane.setConstraints(userName, 1, 0);

        TextField password = new TextField();
        password.setPromptText("Password");
        GridPane.setConstraints(password, 1, 1);

        button = new Button("Click me");
        GridPane.setConstraints(button, 1, 2);

        Button button2 = new Button("Sign Up");
        GridPane.setConstraints(button2, 1, 3);
        button2.getStyleClass().add("button-blue");

        layout.getChildren().addAll(userName,usernameLabel, password, passLabel, button, button2);

        scene = new Scene(layout, 300, 200);
        scene.getStylesheets().add(cssMain.class.getResource("Viper.css").toExternalForm());

        window.setScene(scene);
        window.show();

    }
}
