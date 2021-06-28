/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacao;

import static cacao.LogInController.nombre;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author NZXT
 */



public class Cacao extends Application {
    
    //Host del servidor
    final static String HOST = "25.104.126.22"; 
    //Puerto del servidor
    final static int PUERTO = 5000;
    static DataInputStream in;
    static DataOutputStream out;
    static Socket sc;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void recibirMensaje(){
        
        try {
            in = new DataInputStream(sc.getInputStream());

            String menServer;
        
            menServer = in.readUTF();
            System.out.println(menServer);
        } catch (IOException ex) {
            Logger.getLogger(Cacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //sc.close();
    }
   
    public static void enviarMensaje(){
        try {
            //Creo el socket para conectarme con el cliente
            sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(nombre);

            //Recibo el mensaje del servidor
            String menServer = in.readUTF();

            System.out.println(menServer);

            //sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
