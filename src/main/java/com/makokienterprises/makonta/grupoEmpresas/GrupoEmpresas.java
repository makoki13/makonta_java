package com.makokienterprises.makonta.grupoEmpresas;

import com.makokienterprises.makonta.empresa.Empresa;

import java.util.*;

public class GrupoEmpresas {
    private static int id;
    private static String nombre;

    private static List<Empresa> empresas = new ArrayList<Empresa>();


    public static void inicializa(int idGrupo, String nombreGrupo) {
        id = idGrupo;
        nombre = nombreGrupo;
    }

    public static int getId() {
        return id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setId(int idGrupo) {
        id = idGrupo;
    }

    public static void setNombre(String nombreGrupo) {
        nombre = nombreGrupo;
    }

    @Override
    public String toString() {
        return "GrupoEmpresas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public static void addEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public static List<Empresa> getEmpresas() {
        return empresas;
    }
}
