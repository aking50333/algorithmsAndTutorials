package TableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;

/**
 * Created by Ruben on 7/13/2015.
 */
public class TableViewMain extends Application{


    Stage window;
    Scene scene;
    TextField nameInput, priceInput, quantityInput;
    TableView<Product> table;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("TableView");
        window.setResizable(false);

        // table construction
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));

        TableColumn<Product, String> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(80);
        priceColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));

        TableColumn<Product, String> quanColumn = new TableColumn<>("Quantity");
        quanColumn.setMinWidth(120);
        quanColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quanColumn);;


        //  input fields
        nameInput = new TextField();
        nameInput.setPromptText("name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("price");

        quantityInput = new TextField();
        quantityInput.setPromptText("quantity");


        // buttons and their functionality
        Button addButton = new Button("Add");
        addButton.setOnAction( e -> addButtonClicked());
        Button removeButton = new Button("Remove");
        removeButton.setOnAction( e -> removeButtonClicked());


        // layout for input fileds on the bottom line
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, removeButton);

        // entire layout including the bottom line
        VBox layout = new VBox();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(table, hBox);


        //scene and window initialization and start
        scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    // addButton Functionality
    private void addButtonClicked(){

        Product product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    // removeButton Functionality
    private void removeButtonClicked(){
        table.getItems().remove(table.getSelectionModel().getSelectedItem());
    }



    // returns the product list. Here also could be database
    // connection and the information could be taken from the database
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Banana", 2, 5));
        products.add(new Product("Orange", 3, 4));
        products.add(new Product("Apple", 1.5, 30));
        products.add(new Product("Pineapple", 3.99, 10));
        return products;

    }
}
