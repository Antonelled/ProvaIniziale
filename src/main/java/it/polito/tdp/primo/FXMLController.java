package it.polito.tdp.primo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPremi;

    @FXML
    private Label lblRisposta;

    @FXML
    private TextField txtField;

    @FXML
    void faiQuesto(ActionEvent event) {
    			lblRisposta.setText("Sto premendo e sto fremendo nello sforzo");
    			txtField.setText("Ma se vuoi ti aiuto!");
    }

    @FXML
    void initialize() {
        assert btnPremi != null : "fx:id=\"btnPremi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblRisposta != null : "fx:id=\"lblRisposta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
