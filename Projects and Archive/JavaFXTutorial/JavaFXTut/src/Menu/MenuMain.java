package Menu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Ruben on 7/13/2015.
 */
public class MenuMain extends Application {
    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Application");



        // File Menu here
        Menu fileMenu = new Menu("_File");

        MenuItem newMenu = new MenuItem("New...");
        newMenu.setOnAction( e -> System.out.println("Create new template"));

        fileMenu.getItems().add(newMenu);
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save"));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new MenuItem("Exit"));


        // Edit menu here
        Menu editMenu = new Menu("_Edit");

        MenuItem cutMenu = new MenuItem("Cut");
        cutMenu.setDisable(true);

        editMenu.getItems().addAll(cutMenu, new MenuItem("Copy"), new MenuItem("Paste"));


        // Help menu here
        Menu helpMenu = new Menu("Help");

        CheckMenuItem showLine = new CheckMenuItem("Show Line Numbers");
        showLine.setOnAction( e -> {
            if (showLine.isSelected()){
                System.out.println(false);
            }else{
                System.out.println(true);
            }
        });

        CheckMenuItem autoSave = new CheckMenuItem("Enable AutoSave");
        autoSave.setSelected(true);

        helpMenu.getItems().addAll(showLine, autoSave);


        // Difficulty Menu here
        Menu difficultyMenu = new Menu("Difficulty");

        RadioMenuItem lowMenu = new RadioMenuItem("Low");
        RadioMenuItem mediumMenu = new RadioMenuItem("Medium");
        RadioMenuItem highMenu = new RadioMenuItem("High");

        ToggleGroup group = new ToggleGroup();

        lowMenu.setToggleGroup(group);
        mediumMenu.setToggleGroup(group);
        highMenu.setToggleGroup(group);

        difficultyMenu.getItems().addAll(lowMenu, mediumMenu, highMenu);



        // Main MenuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, difficultyMenu, helpMenu);


        // Layout and scene goes here
        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();

    }
}
