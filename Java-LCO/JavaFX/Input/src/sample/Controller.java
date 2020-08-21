package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textFieldOne;

    @FXML
    public void onButtonTapped(){

        System.out.println("Button was Tapped by: " + textFieldOne.getText());

    }

}
