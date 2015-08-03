package ListView;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/13/2015.
 */
public class ListViewMain extends Application{


    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("This is the title");


        VBox layout  = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        listView = new ListView<>();
        listView.getItems().addAll("Barev", "aper", "jan");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        scene = new Scene(layout, 300, 250);
        button = new Button("Sumbit");
        button.setOnAction( e-> checkClicked());
        layout.getChildren().addAll(button, listView);
        window.setScene(scene);
        window.show();

    }

    private void checkClicked(){
        String message = "";

        ObservableList<String> items;

        items  = listView.getSelectionModel().getSelectedItems();

        for(int i =0; i< items.size(); i++){
            System.out.println(items.get(i));
        }


    }
}
