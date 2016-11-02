package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Button sendBut;
    @FXML
    private TextField login;
    @FXML
    private TextField pass;
    @FXML
    private Button regBut;
    @FXML
    public void sendClick()
    {
        SendLogPass send= new SendLogPass(login.getText()+pass.getText());
        send.sendMsg();
    }

}
