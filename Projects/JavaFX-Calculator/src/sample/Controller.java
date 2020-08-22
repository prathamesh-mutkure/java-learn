package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label result;

    private long num1 = 0L;
    private String operator = "";
    private boolean start = true;

    private Model model = new Model();

    @FXML
    public void processNumbers(ActionEvent event){

        // Initial blank value of Label
        if (start){
            result.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText() + value);
    }

    @FXML
    public void processOperators(ActionEvent event){

        String value = ((Button)event.getSource()).getText();

        // Not equal '='
        if (!value.equals("=")) {

            // We are checking if doesn't press multiple operators
            if (!operator.isEmpty())
                return;

            // Setting operator
            operator = value;

            // Getting the value of num1
            num1 = Long.parseLong(result.getText());

            // Setting Label to blank after entering operator
            result.setText("");

        } else {

            // When user press '=' operator:

            // When user doesn't enter any operator
            // And directly presses =
            // We exit the function
            if (operator.isEmpty())
                return;

            // Getting Number 2
            long num2 = Long.parseLong(result.getText());

            // Setting the values and performing calculations
            result.setText(String.valueOf(model.calculate(num1, num2, operator)));

            // Setting everything to default
            start = true;
            num1 = 0L;
            operator = "";

        }

    }

}
