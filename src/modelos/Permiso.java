/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author utku36
 */
public class Permiso {
    private NivelUsuario nivel;
    private String nombre;

    
    public Permiso(NivelUsuario nivel, String nombre) {
        this.nivel = nivel;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return ("Descripcion: " + this.nivel + "Nombre: " + this.nombre);
    }

    public NivelUsuario getNivel() {
        return nivel;
    }

    public void setNivel(NivelUsuario nivel) {
        this.nivel = nivel;
    }
    
    
}
