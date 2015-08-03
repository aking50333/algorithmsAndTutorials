package Properties;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/17/2015.
 */
public class PropTut extends Application {

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

        Person person = new Person();

        person.firstNameProperty().addListener( (v, oldValue, newValue ) -> {
            System.out.println(newValue);
            System.out.println(person.firstNameProperty());
            System.out.println(person.getFirstName());
        });

        button = new Button("Click me");
        button.setOnAction( e -> {
            person.setFirstName("persona");
        });

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();
        y.bind(x.multiply(10));

        System.out.println("x: " + x.getValue() + " ||| y: " + y.getValue());

        x.setValue(9);

        System.out.println("x: " + x.getValue() + " ||| y: " + y.getValue());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout, 200, 100);
        window.setScene(scene);
        window.show();

    }
}
