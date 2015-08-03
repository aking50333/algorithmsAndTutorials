package GridLayout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by Ruben on 7/12/2015.
 */
public class GridMain  extends Application{

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Window title");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField("Ruben");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);


        Button button = new Button("Login");
        button.setOnAction(e -> {
            String username = nameInput.getText();
            String password = nameInput.getText();
            if (username.equals("Ruben") && password.equals("1234")){
                System.out.println("logged in");
            }else{
                System.out.println("Fuck");
            }
        });

        GridPane.setConstraints(button, 1, 2 );

        gridPane.getChildren().addAll(nameInput,nameLabel, passInput, passLabel, button);
        Scene scene = new Scene(gridPane, 300, 250);


        window.setScene(scene);
        window.show();




    }
}
