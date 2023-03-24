package com.makokienterprises.makonta.empresa;

import com.makokienterprises.makonta.cuentas.Ejercicio;
import com.makokienterprises.makonta.cuentas.PGC;

public class Empresa {
    private static int ultimaEmpresa;
    static {
        ultimaEmpresa = 0 ; //TODO get from database
    }
    private int id;
    private String nombre;

    //datos del plan contable.
    private Ejercicio ejercicioActual;
    private PGC planContable;

    public Empresa() {
        this.id = ++ultimaEmpresa;
        this.nombre = "Sin nombre";
        this.ejercicioActual = null;
    }
    public Empresa(int id, String nombre, Ejercicio ejercicioActual) {
        this.id = id;
        this.nombre = nombre;
        this.ejercicioActual = ejercicioActual;
    }

    public Empresa(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ejercicioActual = null;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ejercicio getEjercicioActual() {
        return this.ejercicioActual;
    }

    public void setEjercicioActual(Ejercicio ejercicioActual) {
        this.ejercicioActual = ejercicioActual;
    }

    public void setPlanContable(PGC planContable) {
        this.planContable = planContable;
    }
    public PGC getPlanContable() {
        return this.planContable;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ejercicioActual=" + ejercicioActual.getAnyo() +
                ", numeroDigitos=" + planContable.getNumeroDigitos() +
                '}';
    }
}
