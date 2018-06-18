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
public enum Modelo {
    
    CLIO(Marca.RENAULT, 1),
    CORSA(Marca.FIAT, 33),
    C4(Marca.CITROEN, 12),
    CORVETTE(Marca.CHEVROLET, 78),
    A4(Marca.AUDI, 45);
    
    
    private Marca marca;
    private int codigoModelo;
    
    Modelo(Marca marca, int codigoModelo) {
        this.marca = marca;
        this.codigoModelo = codigoModelo;
    }   
}
