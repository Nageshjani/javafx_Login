package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.awt.event.ActionEvent;

public class MainController {

    @FXML

    private Label lblStatus;

    @FXML

    private TextField txtUserName;

    @FXML

    private TextField txtPasswords;




    public void Login(ActionEvent event){
        if(txtUserName.getText().equals("user") && txtPasswords.getText().equals("pass") ){
            lblStatus.setText("login success");
        }
        else{
            lblStatus.setText("login failed");
        }

    }








}
