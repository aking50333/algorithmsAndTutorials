package FirstTut;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("Welcome to the first Scene");
        Button button1 = new Button("Go to Scene2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 250);
        scene1.setCursor(Cursor.MOVE);

        Label label2 = new Label("Welcome to the Second Scene");
        Button button2 = new Button("Go to Scene1");
        button2.setOnAction(e -> window.setScene(scene1));

        HBox layout2 = new HBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 300, 250);

        window.setScene(scene1);
        window.setTitle("Title");
        window.setResizable(false);
        window.show();


    }


}
