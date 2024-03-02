package it.polito.tdp.primo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    void handleButtonAction(ActionEvent event) {
    		lblRisposta.setText("Sto premento e fremendo nella risposta");
    }

    @FXML
    void initialize() {
        assert btnPremi != null : "fx:id=\"btnPremi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblRisposta != null : "fx:id=\"lblRisposta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
