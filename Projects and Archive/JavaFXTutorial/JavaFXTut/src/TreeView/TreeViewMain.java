package TreeView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Stack;

/**
 * Created by Ruben on 7/13/2015.
 */
public class TreeViewMain extends Application{


    Scene scene;
    Stage window;
    TreeView<String> tree;
    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("TreeView Title");


        TreeItem<String> root, branch1, branch2;

        root = new TreeItem<>();
        root.setExpanded(true);

        // branch1
        branch1 = makeBranch("Ruben", root);
        makeBranch("Tandz", branch1);
        makeBranch("Xndzor", branch1);

        // branch2
        branch2 = makeBranch("Raffi", root);
        makeBranch("Dexdz", branch2);


        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty()
                .addListener( (v, oldValue, newValue) -> {
                    if (newValue != null)
                        System.out.println(newValue.getValue());
                } );


        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();


    }

    private TreeItem<String> makeBranch(String name, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(name);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
