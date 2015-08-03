package EmbeddedLayout;

import DifferentWindows.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/12/2015.
 */
public class Main extends Application {

    Stage window;

    public static void main(String args[]){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("San Jose App");

        HBox topMenu = new HBox(10);
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox(10);
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);


        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(leftMenu);
        borderPane.setTop(topMenu);

        Scene scene = new Scene(borderPane, 300, 250);
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
