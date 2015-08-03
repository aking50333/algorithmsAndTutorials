package ComboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/13/2015.
 */
public class ComboBoxMain extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("The New York City");

        button = new Button("Order Now");
        button.setOnAction( e -> printFruit());

        comboBox = new ComboBox<>();
        comboBox.setOnAction( e -> System.out.println(comboBox.getValue()));
        comboBox.setEditable(true);
        comboBox.getItems().addAll(
                "Apples",
                "Oranges",
                "Bananas"
        );

        VBox layout = new VBox(10);
        layout.getChildren().addAll(button, comboBox);
        layout.setPadding(new Insets(10, 10, 10, 10));

        scene = new Scene(layout, 300, 260);
        window.setScene(scene);
        window.show();

    }

    private void printFruit(){
        System.out.println(comboBox.getValue());
    }




}
