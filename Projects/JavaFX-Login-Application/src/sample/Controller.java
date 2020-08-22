package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    private Label result = new Label();

    private Data users = new Data();

    @FXML
    public void loginTapped() {

        users.setUsers("USER1", "pass1");
        users.setUsers("USER2", "pass2");
        users.setUsers("USER3", "pass3");
        users.setUsers("USER4", "pass4");
        users.setUsers("USER5", "pass5");

       if (!username.getText().isEmpty() && !password.getText().isEmpty()){

           if (password.getText().equals(users.getUserPassword(username.getText()))){
               result.setText("Login Successful");
               return;
           }
           if (users.getUserPassword(username.getText()) == null){
               result.setText("Account Doesn't exists");
           }
           else {
               result.setText("Login Failed, Incorrect Password");
           }
       } else {
           result.setText("Please enter username or password first");
       }

    }

}