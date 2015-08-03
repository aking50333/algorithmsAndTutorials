package ValidateMain;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/13/2015.
 */
public class ValidateMain extends Application{


    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title");

        TextField textField = new TextField();
        textField.setPromptText("Type here");
        button = new Button("Click me");

        button.setOnAction(e -> {
            isValid(textField, textField.getText());
        });


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(textField, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();

    }

    private boolean isValid(TextField input, String text ){

        try{
            int age = Integer.parseInt(text);
            System.out.println("The user " + age);
            return true;

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            return false;
        }


    }
}
