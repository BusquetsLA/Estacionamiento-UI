/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallalogin;

import estacionamientoui.ContratoControladorVistas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import modelos.NivelUsuario;
/**
 *
 * @author utku36
 */
public class VistaLogin implements ContratoVistaLogin{
    private ContratoPresentadorLogin presentador;
    private ContratoControladorVistas controlador;
    
    private Scene escena;
    private BorderPane lienzo;
    private VBox disenioVertical;
    private HBox cajaNombreUsuario;
    private HBox cajaContrasenia;
    private Label textoLogin;
    private Text textoNombreUsuario;
    private TextField ingresoNombreUsuario;
    private Text textoContrasenia;
    private TextField ingresoContrasenia;
    private Button botonIngresar;
    private Label mensajeError;
    
    public VistaLogin(ContratoControladorVistas controlador){
        this.controlador = controlador;
        this.presentador = new PresentadorLogin();
        this.organizarVistas();
    }
    
    private void organizarVistas(){
        
        this.textoLogin = new Label("LOGIN");
        this.textoNombreUsuario = new Text("Usuario: ");
        this.ingresoNombreUsuario = new TextField("Usuario...");
        this.textoContrasenia = new Text("Contraseña: ");
        this.ingresoContrasenia = new TextField("Contraseña...");
        this.botonIngresar = new Button("INGRESAR");
        this.mensajeError = new Label("Nombre de usuario o contraseña incorrectas.");
        
        this.lienzo = new BorderPane();
        this.cajaNombreUsuario = new HBox(10, textoNombreUsuario, ingresoNombreUsuario);
        this.cajaContrasenia = new HBox(10, textoContrasenia, ingresoContrasenia);
        this.escena = new Scene(lienzo, 300, 300);
        this.disenioVertical = new VBox(10, textoLogin,cajaNombreUsuario, cajaContrasenia, botonIngresar, mensajeError);
        this.disenioVertical.setMaxWidth(Region.USE_PREF_SIZE);
        this.lienzo.setCenter(this.disenioVertical);
        
        this.botonIngresar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                NivelUsuario nivel = presentador.login(ingresoNombreUsuario.getCharacters().toString(), 
                        ingresoContrasenia.getCharacters().toString()); 
                if(nivel == null){
                    mostrarPantallaError();
                } else {
                    controlador.lanzarMenu(nivel);
                }
            }
        });
        
    }
    
    @Override
    public Scene obtenerEscena(){
        return this.escena;
    }
    public void mostrarPantallaError(){
       
    }
    
}
