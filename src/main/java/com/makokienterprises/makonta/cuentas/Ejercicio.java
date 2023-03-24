package com.makokienterprises.makonta.cuentas;

import com.makokienterprises.makonta.empresa.Empresa;

public class Ejercicio {
    private static int ultimaEmpresa;
    static {
        ultimaEmpresa = 0 ; //TODO get from database
    }
    private long id;
    private int anyo;
    private boolean activo;
    private boolean cerrado;
    private boolean prueba;

    public Ejercicio(int anyo) {
        this.id = ++ultimaEmpresa;
        this.anyo = anyo;
        this.activo = false;
        this.cerrado = false;
        this.prueba = false;
    }

    public int getAnyo() {
        return anyo;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public boolean isPrueba() {
        return prueba;
    }
}
