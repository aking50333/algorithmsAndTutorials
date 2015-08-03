package DifferentWindows;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/12/2015.
 */
public class Main extends Application {

    Stage window;
    Scene scene;

    public static void main(String args[]){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("San Jose App");

        Button button = new Button("Click me");
        StackPane layout = new StackPane(button);

        button.setOnAction(e -> {
            boolean result  = ConfirmBox.display("Alert Box Title", "Answer");
            System.out.println(result);
        });

        scene = new Scene(layout, 200, 200);

        window.setScene(scene);
        window.show();

    }
}
