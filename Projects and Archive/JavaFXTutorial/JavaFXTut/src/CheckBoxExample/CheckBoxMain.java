package CheckBoxExample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/13/2015.
 */
public class CheckBoxMain extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("The New York City");

        button = new Button("Order Now");
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");

        button.setOnAction( e -> handleEvent(box1, box2));
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(button, box1, box2);

        scene = new Scene(layout, 300, 260);
        window.setScene(scene);
        window.show();

    }

    private void handleEvent(CheckBox... boxes){
        CheckBox [] box = boxes;
        for (int i =0; i < box.length; i++){
            if (box[i].isSelected()){
                System.out.println(box[i].getText());
            }
        }



    }
}
