package com.makokienterprises.makonta.empresa;

public class Empresa {
    private int id;
    private String nombre;

    //datos del plan contable.
    private int ejercicioActual;
    private int digitosSubcuenta;

    public Empresa() {
        this.id = -1;
        this.nombre = "Sin nombre";
        this.ejercicioActual = 2023;
        this.digitosSubcuenta = 8;
    }
    public Empresa(int id, String nombre, int ejercicioActual, int digitosSubcuenta) {
        this.id = id;
        this.nombre = nombre;
        this.ejercicioActual = ejercicioActual;
        this.digitosSubcuenta = digitosSubcuenta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEjercicioActual() {
        return ejercicioActual;
    }

    public int getDigitosSubcuenta() {
        return digitosSubcuenta;
    }
}
