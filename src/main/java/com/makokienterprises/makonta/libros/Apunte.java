package com.makokienterprises.makonta.libros;

import com.makokienterprises.makonta.cuentas.Cuenta;
import com.makokienterprises.makonta.persistencia.ApuntePersistencia;

import java.util.Date;

public class Apunte extends ApuntePersistencia {
    private Asiento asiento;
    private int cardinal;

    private Cuenta cuenta;
    private double importe;
    private Asiento.Diario posicion; //1 debe 2 Haber
    private String anotacion;
    private Date momento;

    public Apunte(Cuenta cuenta, double importe, Asiento.Diario posicion, String anotacion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.posicion = posicion;
        this.anotacion = anotacion;
    }

    public void setCardinal(int cardinal) {
        this.cardinal = cardinal;
    }

    public int getCardinal() {
        return cardinal;
    }

    public Asiento.Diario getPosicion() {
        return this.posicion;
    }

    public double getImporte() {
        return importe;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }


}
