package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button button;

    @FXML
    Label firstLabel;

    @FXML
    ToggleGroup togglegroup;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading ");
    }

    public void clickMe(){
        System.out.println("Load Done");
        firstLabel.setText("Jelly Belly");
    }
}
