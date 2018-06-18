/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallalogin;

import modelos.NivelUsuario;

/**
 *
 * @author utku36
 */
public interface ContratoPresentadorLogin {
    public NivelUsuario login(String usuario, String contrasenia);
}
