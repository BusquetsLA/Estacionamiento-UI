/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utku36
 */
public class Usuario {
    private String apellido;
    private String nombre;
    private String nombreUsuario;
    private String password;
    // Atributos agregados
    private List<Permiso> permisos;

    
    public Usuario(String apellido, String nombre, String nombreUsuario, String password) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = new ArrayList();
    }

    public Usuario() {
    }
    
    
    public String conocerPermisos() {
        String retorno = "";
        
        for(Permiso permiso: permisos) {
            retorno += permiso.toString() + "\n";
        }
        
        return retorno;
    }

    @Override
    public String toString() {
        return ( "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + "NombreUsuario: " + this.nombreUsuario );
    }
}
