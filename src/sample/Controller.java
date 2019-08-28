package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField txtName;

    @FXML
    private Button btnSubmit;

    @FXML
    private Label lblNameOut;

    @FXML
    void showName(MouseEvent event) {
        //System.out.println("in showName")
        String name = txtName.getText();
        System.out.println(name);

        lblNameOut.setText(name);
    }

}