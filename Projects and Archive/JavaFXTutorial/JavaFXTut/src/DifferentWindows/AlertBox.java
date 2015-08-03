package DifferentWindows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 * Created by Ruben on 7/12/2015.
 */
public class AlertBox {

    public static void display(String title, String message){

        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);
        window.setMinHeight(200);

        Label label = new Label();
        label.setText(message);

        Button button = new Button();
        button.setText("Close");
        button.setOnAction(e -> window.close());


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 150, 150);

        window.setScene(scene);
        window.showAndWait();





    }


}
