package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    private Button windows;
    @FXML
    private Button macOS;
    @FXML
    private Button linux;
    @FXML
    private Button android;

    public void onButtonTapped(ActionEvent e){

        if (e.getSource().equals(windows)){
            System.out.println("Windows Tapped by: " + textField.getText());
        } else if (e.getSource().equals(macOS)){
            System.out.println("MacOS Tapped by: " + textField.getText());
        } else if (e.getSource().equals(linux)){
            System.out.println("Linux Tapped by: " + textField.getText());
        } else if (e.getSource().equals(android)){
            System.out.println("Android Tapped by: " + textField.getText());
        }

    }

}
