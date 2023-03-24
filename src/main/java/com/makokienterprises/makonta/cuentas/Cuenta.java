package com.makokienterprises.makonta.cuentas;

public class Cuenta {
    private static long ultimoId = 0;
    private long id;
    private String codigo;
    private String nombre;

    private static long getNuevoId() {
        return ++ultimoId;
    }

    public Cuenta() {
        this.id = ++ultimoId;
        this.codigo = "";
        this.nombre = "";
    }

    public Cuenta(long id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
