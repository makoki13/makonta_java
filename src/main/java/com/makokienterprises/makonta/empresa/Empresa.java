package com.makokienterprises.makonta.empresa;

import com.makokienterprises.makonta.cuentas.Ejercicio;
import com.makokienterprises.makonta.cuentas.Pgc;
import com.makokienterprises.makonta.persistencia.EmpresaPersistencia;

public class Empresa extends EmpresaPersistencia {
    private static int ultimaEmpresa;
    static {
        ultimaEmpresa = 0 ; //TODO get from database
    }
    private int id;
    private String nombre;

    //datos del plan contable.
    private Ejercicio ejercicioActual;
    private Pgc planContable;

    public Empresa() {
        this.id = ++ultimaEmpresa;
        this.nombre = "Sin nombre";
        this.ejercicioActual = null;

        //this.inserta();
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

    public void setPlanContable(Pgc planContable) {
        this.planContable = planContable;
    }
    public Pgc getPlanContable() {
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
