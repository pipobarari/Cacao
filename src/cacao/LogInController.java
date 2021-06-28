/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacao;

import cacao.Cacao;
import static cacao.Cacao.enviarMensaje;
import static cacao.Cacao.recibirMensaje;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author NZXT
 */
public class LogInController implements Initializable {

    @FXML
    private TextField txtNombreJugador;
    @FXML
    private Button btnJugar;
    @FXML
    private AnchorPane raiz;
    
    static String nombre;
    @FXML
    private JFXDatePicker txtNacimiento;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void onActionBtnJugar(ActionEvent event) {      
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Juego.fxml"));
            
            nombre = txtNombreJugador.getText();
            enviarMensaje();
            recibirMensaje();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage ventana = (Stage) raiz.getScene().getWindow();
            ventana.close();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(LogInController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
