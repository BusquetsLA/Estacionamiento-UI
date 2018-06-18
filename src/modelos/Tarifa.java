/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author utku36
 */
public class Tarifa {
    private int cantidadIngresosSinSaldo;
    private Date fechaDesde;
    private Date fechaHasta;
    private float montoIngreso;
    private boolean esDeAbono;

    
    public Tarifa(int cantidadIngresosSinSaldo, Date fechaDesde, Date fechaHasta, float montoIngreso, boolean esDeAbono) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.montoIngreso = montoIngreso;
        this.esDeAbono = esDeAbono;
    }

    public Tarifa() {
    }
    
    /**
     * METODO SIN IMPLEMENTAR
     */
    public void conocerTipoVehiculo() {
        
    }

    @Override
    public String toString() {
        return  "Fecha de inicio: " + this.fechaDesde + "\n" + "Fecha de finalización: " + this.fechaHasta + "\n"
        + "Monto Ingreso: " + this.montoIngreso + "\n" + "Abono: " + this.esDeAbono;
    }
}
