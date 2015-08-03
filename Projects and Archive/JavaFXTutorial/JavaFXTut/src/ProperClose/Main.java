package ProperClose;

import DifferentWindows.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        Button button = new Button("Click me");
        StackPane layout = new StackPane(button);

        button.setOnAction(e -> closeProgram());

        scene = new Scene(layout, 200, 200);

        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        boolean answer = ConfirmBox.display("Harc", "Bagel te chpagel ?");
        if (answer){
            System.out.println("Pagvav ap jan !!!!");
            window.close();
        }else{
            System.out.println("Abris ap !!!!!");
        }
    }
}
