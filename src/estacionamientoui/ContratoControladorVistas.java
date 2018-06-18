/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamientoui;

import modelos.NivelUsuario;

/**
 *
 * @author utku36
 */
public interface ContratoControladorVistas {
    public void lanzarPantallaLogin();

    public void lanzarMenu(NivelUsuario nivel);
}
