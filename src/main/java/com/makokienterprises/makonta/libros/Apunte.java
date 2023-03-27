package com.makokienterprises.makonta.libros;

import com.makokienterprises.makonta.cuentas.Cuenta;
import com.makokienterprises.makonta.interfaces.IPersistencia;

import java.util.Date;

public class Apunte implements IPersistencia {
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

    public Asiento.Diario getPosicion() {
        return this.posicion;
    }

    public double getImporte() {
        return importe;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public boolean inserta() {
        return false;
    }

    @Override
    public boolean actualiza() {
        return false;
    }

    @Override
    public boolean borra() {
        return false;
    }
}
