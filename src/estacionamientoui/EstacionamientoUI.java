/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamientoui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import modelos.NivelUsuario;
import pantallalogin.ContratoVistaLogin;
import pantallalogin.VistaLogin;

/**
 *
 * @author utku36
 */
public class EstacionamientoUI extends Application implements ContratoControladorVistas{
    private Stage escenarioPrincipal;
    private ContratoVistaLogin vistaLogin;
    
    @Override
    public void start(Stage primaryStage) {
        this.escenarioPrincipal = primaryStage;
        this.lanzarPantallaLogin();
        this.escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void lanzarPantallaLogin() {
        this.vistaLogin = new VistaLogin(this);
        this.escenarioPrincipal.setScene(this.vistaLogin.obtenerEscena());
    }

    @Override
    public void lanzarMenu(NivelUsuario nivel) {
        System.out.println("Llego a lanzar menu con nuivel: " + nivel);
        //this.vistaMenu = new VistaMenu(nivel);
        //this.escenarioPrincipal.setScene(this.vistaMenu.obtenerEscene());
    }
    
}
